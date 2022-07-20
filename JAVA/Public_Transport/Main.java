public class Main {
    public static void main(String[] args) {

        Bus bus = new Bus();
        bus.BusCreate(100);
        System.out.println("---------승객 2명 탑승---------");
        bus.getpassenger(2);

        System.out.println("---------연료 사용---------");
        bus.useoil(50);

        System.out.println("---------상태 변경---------");
        bus.changestatus("차고지행");

        System.out.println("---------주유---------");
        bus.getoil(10);

        System.out.println("---------상태 변경---------");
        bus.changestatus("운행중");

        System.out.println("---------승객 45명 탑승---------");
        bus.getpassenger(45);

        System.out.println("---------승객 5명 탑승---------");
        bus.getpassenger(5);

        System.out.println("---------55 주유 사용---------");
        bus.useoil(55);

        System.out.println("");

        System.out.println("------------택시 생성------------");
        Taxi taxi = new Taxi();
        taxi.taxicreate(1234);

        System.out.println("---------2 승객 탑승---------");
        taxi.getpassenger(2,"서울역", 2);

        System.out.println("---------80 연료 사용---------");
        taxi.useoil(80);

        System.out.println("---------요금 결제---------");
        taxi.incomeshow();

        System.out.println("---------5 승객 탑승---------");
        taxi.getpassenger(5,"서울역",2);

        System.out.println("---------3 승객 탑승---------");
        taxi.getpassenger(3, "구로디지털단지역", 12);

        System.out.println("---------20 연료 사용---------");
        taxi.useoil(20);

        System.out.println("---------요금 결제---------");
        taxi.incomeshow();

        System.out.println("---------택시 상태---------");
        taxi.taxistatus();
    }
}