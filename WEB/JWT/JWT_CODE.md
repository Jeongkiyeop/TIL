## 서버에 전달 후 토큰값 받기

```
function sign_in() {

let username = $("#input-username").val()
let password = $("#input-password").val()

$.ajax({
    type: "POST",
    url: "/sign_in",
    data: {
        username_give: username,
        password_give: password
    },
    success: function (response) {
        if (response['result'] == 'success') {
            $.cookie('mytoken', response['token'], {path: '/'});
            window.location.href = "/main/" + response['userhash'] 
            # 당시 닉네임을 이용한 브라우저 이동을 했기에 유저닉네임에도 해쉬값을 주었음 

        } else {
            alert(response['msg'])
        }
    }
}
```

## 전달 받은 값 확인 후 클라이언트에게 보내주기
```
@app.route('/sign_in', methods=['POST'])
def sign_in():
    # 로그인
    username_receive = request.form['username_give']
    password_receive = request.form['password_give']
    pw_hash = hashlib.sha256(password_receive.encode('utf-8')).hexdigest()  # 해쉬 함수 사용
    result = db.users.find_one({'username': username_receive, 'password': pw_hash}) 

    if result is not None:
        payload = {
            'id': username_receive,
            'exp': datetime.utcnow() + timedelta(seconds=60 * 60 * 24)  # 로그인 24시간 유지 (토큰 유효기간)
        }
        try:
            token = jwt.encode(payload, SECRET_KEY, algorithm='HS256').decode('utf-8')
        except AttributeError:
            token = jwt.encode(payload, SECRET_KEY, algorithm='HS256')      # 이미 decode 되어 있다는 오류가 떠 트라이문 사용

        return jsonify({'result': 'success', 'token': token})

    # 찾지 못하면
    else:
        return jsonify({'result': 'fail', 'msg': '아이디/비밀번호가 일치하지 않습니다.'})

```