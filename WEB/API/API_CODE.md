## API 네이버 지도 API 사용해보기

```html
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport"
              content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
        <title>간단한 지도 표시하기</title>
        <script type="text/javascript"
                src="https://openapi.map.naver.com/openapi/v3/maps.js?ncpClientId=YOUR_CLIENT_ID"></script>    // map이란 id를 스크립트와 연결 해줌. 내 클라이언트 id 넣기
        <script src=" https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

        <style>
            #map {
                width: 100%;
                height: 400px;
            }
        </style>

        <script>
            $(document).ready(function () {
                let map = new naver.maps.Map('map', {   // 네이버에서 지도를 만든다는 뜻
                    center: new naver.maps.LatLng(37.4981125, 127.0379399),  // 위도와 경도 값
                    zoom: 10            // 기본값 세팅
                });
            })
        </script>
    </head>
    <body>
        <div id="map"></div>
    </body>
</html>
```

``` python
@app.route('/map')
def map():
    return render_templates("*.html")
```
