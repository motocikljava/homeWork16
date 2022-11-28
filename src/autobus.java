public class autobus extends tpansport {


    public autobus(String mark, int year, String country, double maxSpeed, String color) {
        super(mark, year, country, maxSpeed, color);
    }

    @Override
    public void refil() {
        System.out.println("заправка бензином");
    }
}
