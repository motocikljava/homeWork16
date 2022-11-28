public class Main {
    public static void main(String[] args) {
        car.Insurance insurLada = new car.Insurance(2022, 1.1, 1);
        car.Insurance insurAudi = new car.Insurance(2022, 1.1, 1);
        car.Insurance insurBmw = new car.Insurance(2022, 1.1, 1);
        car.Insurance insurHuindai = new car.Insurance(2023, 1.1, 1);
        car.Insurance insurKia = new car.Insurance(2022, 1.1, 1);
//(String mark, String model, int year, String country, String color, double maxSpeed, double engineVolume,
//               String transmission, String bodyType, int numberOfSeats, String winOrSumSires) {



        car lada = new car("Lada", "Granda", 2015, "Россия", "жёлтый", 200, 1.7, "механическая",
                "седан", 5 , "зимняя");
        lada.setInsurance(insurLada);
        /*
        car audi = new car("Audi A8 50 L TDI quattro",3.0,"чёрный", 2020, "Германия",
                "автоматическая", "седан", 4, 0);
        audi.setInsurance(insurAudi);

        car bmw = new car("BMW Z8",3.0, "чёрный", 2021, "Германия",
                "автоматическая", "седан", 4, 1);
        bmw.setInsurance(insurBmw);

        car kia = new car("Kia Sportage 4 поколение",2.4,"красный", 2018, "Южная Корея",
                "автоматическая", "седан", 4, 1);
        kia.setInsurance(insurKia);

        car huindai = new car("Hyundai Avante",1.6,"оранжевый", 2016, "Южная Корея",
                "автоматическая", "седан", 4, 0);
        huindai.setInsurance(insurHuindai);
        Поезд Ленинград, модель D-125, 2019 год выпуска в России, скорость передвижения – 270 км/ч,
         отходит от Ленинградского вокзала и следует до станции Ленинград-Пассажирский. Цена поездки - 1700 рублей, в поезде 8 вагонов.

         */
        train lastochka = new train("Ласточка В-901", 2011, "Россия",301.0,
                3500, "Белорусский вокзал", "Минск-Пассажирский", 11, null);
        train leningrad = new train("Ленинград D-125", 2019, "Россия", 270.0,
                1700, "Ленинградский вокзал", "Ленинград-Пассажирский", 8, null);

        autobus paz = new autobus("Пазик", 2008, "Россия", 180, "голубой");



        System.out.println(lada);
        lada.refil();
        insurLada.validStrahovka();
        insurLada.checkVal();
        insurLada.chAutoNumber();
        System.out.println(lastochka);
        System.out.println(leningrad);
        lastochka.refil();
        leningrad.refil();
        System.out.println(paz);
        paz.refil();

        /*
        System.out.println(audi);

        insurAudi.checkVal();
        insurAudi.validStrahovka();
        System.out.println(bmw);
        insurBmw.validStrahovka();
        insurBmw.checkVal();
        System.out.println(kia);
        insurKia.validStrahovka();
        insurKia.checkVal();
        System.out.println(huindai);
        insurHuindai.validStrahovka();
        insurHuindai.checkVal();
        car.checAutoNumber();

         */
        System.out.println(lastochka);
        System.out.println(leningrad);
    }
}