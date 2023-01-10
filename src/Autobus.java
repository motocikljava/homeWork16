public class Autobus extends Tpansport {


    public Autobus(String mark, int year, String country, double maxSpeed, String color) {
        super(mark, year, country, maxSpeed, color);
    }

    @Override
    public void refil() {
        System.out.println("заправка бензином");
    }
}
