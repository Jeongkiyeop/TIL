import java.util.UUID;

import java.util.UUID;
public class Bus extends public_transport {

    public void BusCreate(String busnumber){
        busnumber = UUID.randomUUID().toString();
        this.number = busnumber;
        System.out.println(this.number + "번 버스");
    }

    public void getpassenger(int getpassenger){
        if ((currentpassenger + getpassenger) < 31) {
            this.currentpassenger += getpassenger;
            this.busfare = getpassenger * 1000;
            System.out.println(getpassenger + "명 탑승");
            System.out.println("잔여 승객 수 " + (30 - currentpassenger));
            System.out.println("요금 " + busfare);
        }else {
            System.out.println("최대 승객 수 초과");
        }
    }

    public void useoil(int useoil){
        this.oil -= useoil;
        if (this.oil < 10){
            this.currentstatus = "현재 상태 " + busstatus[1];
            System.out.println("주유량 " + this.oil);
            System.out.println(currentstatus);
            System.out.println("주유필요");

        }else {
            System.out.println("주유량 " + this.oil);
        }
    }
    public void getoil(int oil){
        this.oil = this.oil + oil;
        System.out.println("주유량 " + this.oil);
        System.out.println("현재 상태 "+currentstatus);
    }

    public void changestatus(String status){
        if (status.equals("운행중")){
            this.currentstatus = status;
            System.out.println("현재 상태 운행중");
        }else {
            this.currentstatus = status;
            System.out.println("현재 상태 차고지행");
        }
    }

    public void speedup(int speed){
        this.speed += speed;
        System.out.println("현재 속도 " + this.speed);
    }

    public void speeddown(int speed){
        this.speed -= speed;
        System.out.println("현재 속도 " + this.speed);
    }
}

