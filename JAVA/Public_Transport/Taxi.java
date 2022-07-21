import java.util.UUID;
public class Taxi extends public_transport {


    public void taxicreate(String taxinumber) {
        taxinumber = UUID.randomUUID().toString();
        this.number = taxinumber;
        this.taxifare = taxifare;
        System.out.println(taxinumber + "번 택시");
        System.out.println("주유량 " + oil);
        System.out.println(currentstatus);
    }

    public void getpassenger(int getpassenger, String des, int desdistance) {
        if (getpassenger > 4) {
            System.out.println("최대 승객 수 초과");
        } else {
            currentpassenger = 0;
            this.currentpassenger += getpassenger;

            System.out.println("탑승 승객수 " + getpassenger);
            System.out.println("잔여 승객수 " + (4 - currentpassenger));
            System.out.println("기본 요금 " + taxifare);
            System.out.println("목적지 " + des);
            System.out.println("목적지까지 거리 " + desdistance + "km");
            System.out.println("지불할 요금 " + (taxifare + (desdistance - 1) * 1000));
            income = (taxifare + (desdistance - 1) * 1000);
            changestatus("운행중");
        }
    }

    public void changestatus(String status) {
        if (status.equals("운행중")) {
            this.currentstatus = status;
            System.out.println("현재 상태 운행중");
        } else {
            this.currentstatus = status;
            System.out.println("현재 상태 일반");
        }
    }

    public void useoil(int oil) {
        this.oil -= oil;
        System.out.println("주유량 "+this.oil);
    }

    public void incomeshow() {
        System.out.println("누적 요금 "+income);
    }

    public void taxistatus(){
        System.out.println("주유량 "+this.oil);
        System.out.println("누적 요금 "+income);
        if (this.oil <= 0){
            System.out.println("현재 상태 "+taxistatus[1]);
            System.out.println("주유 필요.");
        }else {
            System.out.println("현재 상태 "+taxistatus[0]);
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
