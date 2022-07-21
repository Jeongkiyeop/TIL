public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        bus1.BusCreate("100");
        bus2.BusCreate("200");

        System.out.println("");
        System.out.println("---------승객 2명 탑승---------");
        bus1.getpassenger(2);

        System.out.println("");
        System.out.println("---------연료 사용---------");
        bus1.useoil(50);

        System.out.println("");
        System.out.println("---------상태 변경---------");
        bus1.changestatus("차고지행");

        System.out.println("");
        System.out.println("---------주유---------");
        bus1.getoil(10);

        System.out.println("");
        System.out.println("---------상태 변경---------");
        bus1.changestatus("운행중");

        System.out.println("");
        System.out.println("---------승객 45명 탑승---------");
        bus1.getpassenger(45);

        System.out.println("");
        System.out.println("---------승객 5명 탑승---------");
        bus1.getpassenger(5);

        System.out.println("");
        System.out.println("---------55 주유 사용---------");
        bus1.useoil(55);

        System.out.println("");
        System.out.println("---------10 속도 상승---------");
        bus1.speedup(10);

        System.out.println("");
        System.out.println("---------4 속도 감소---------");
        bus1.speeddown(4);


        System.out.println("");
        System.out.println("");

        System.out.println("------------택시 생성------------");

        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();
        taxi1.taxicreate("1111");
        taxi2.taxicreate("2222");

        System.out.println("");
        System.out.println("---------2 승객 탑승---------");
        taxi1.getpassenger(2,"서울역", 2);

        System.out.println("");
        System.out.println("---------80 연료 사용---------");
        taxi1.useoil(80);

        System.out.println("");
        System.out.println("---------요금 결제---------");
        taxi1.incomeshow();

        System.out.println("");
        System.out.println("---------5 승객 탑승---------");
        taxi1.getpassenger(5,"서울역",2);

        System.out.println("");
        System.out.println("---------3 승객 탑승---------");
        taxi1.getpassenger(3, "구로디지털단지역", 12);

        System.out.println("");
        System.out.println("---------20 연료 사용---------");
        taxi1.useoil(20);

        System.out.println("");
        System.out.println("---------요금 결제---------");
        taxi1.incomeshow();

        System.out.println("");
        System.out.println("---------택시 상태---------");
        taxi1.taxistatus();

        System.out.println("");
        System.out.println("---------20 속도 상승---------");
        taxi1.speedup(20);

        System.out.println("");
        System.out.println("---------15 속도 감소---------");
        taxi1.speeddown(15);
    }

}