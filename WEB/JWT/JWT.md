 JWT 서비스를 사용하는 사용자들은 로그인시 토큰을 받게된다. 
 <br>
 이때 토큰은  header, payload, verify signature로 구성되는데 먼저 payload 같은 경우 Base64(?)로 디코딩시 JSON 형식으로 된 많은 정보가 있다. 1. 누가 누구에게 발급 했는지 2. 언제까지 유효한지 3. 공개 가능한 범위 등 서비스 측에서 원하는 대로 담을 수 있다.
<br>
이러한 것들을 담은 사용자의 정보를 'Claim'이라고 한다.
<br>
하지만 payload 만으로는 한계가 있다. 예를 들어 Base64 다시 한번 디코딩 한다면 악용 할 수 있는 가능성이 있기 때문에 header와 verify signature를 사용한다.
<br>
먼저 header를 디코딩 하면 JWT타입과 alg(알고리즘)이 들어있다. 이때 alg는 verify signature에 값을 만들 알고리즘(HS256 등 여러 암호화 방식 중 하나를 지정 할 수 있다.)이 지정된다.
<br>
header, payload 그리고 서버만이 가지고 있는 비밀키를 알고리즘에 작동 시키면 verify signature 값이 나온다.

이때 verify signature 값과 header, payload 서버의 비밀키를 돌린 값이 같다면 사용자는 authorization(인가)을 받는다
<br>
하지만 JWT 토큰 방식도 단점이 있는데 만약 어떤 악당이 토큰을 가지고 악용 한다면 무효화 할 수 있는 방법이 없다.
<br>
그래서 생각 해낸 방법이 access 토큰과 refresh 토큰인데 access토큰은 몇분, 몇시간 유효기간을 주고 refresh 토큰은 2주, 더 길게 유효기간을 준다. 이때 refresh 토큰은 세션 방식처럼 데이터베이스에도 저장을 한다. 사용자의 access토큰의 수명이 다한다면 refresh 토큰을 서버에 보내고 서버는 데이터베이스에 저장된 값을 대조 해보고 일치 한다면 다시 access토큰을 부여 하는 방식이 있다.

## <br>
+ [JWT_CODE](WEB/JWT/JWT_CODE.md)
