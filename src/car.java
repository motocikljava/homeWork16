import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class car extends tpansport{
double engineVolume;
    String transmission;
    protected String bodyType;
    String autoNumber;
    protected int numberOfSeats;
    String winOrSumSires;


    public car(String mark, String model, int year, String country, String color, double maxSpeed, double engineVolume,
               String transmission, String bodyType, int numberOfSeats, String winOrSumSires) {
        super(mark, year, country, maxSpeed, color);
        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.numberOfSeats = numberOfSeats;
        this.winOrSumSires = winOrSumSires;
    }

    @Override
    public String toString() {
        return "car{" +
                "engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", mark='" + mark + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public void refil() {
            System.out.println("заправка бензином");
    }


    public static class key {
        private String remoteStart;
        private String keylessAccess;

        public key(String remoteStart, String keylessAccess) {
            if (remoteStart != null || !remoteStart.isEmpty()|| !remoteStart.isBlank()) {
                this.remoteStart = remoteStart;
            }

            if (keylessAccess != null || !keylessAccess.isBlank()|| !keylessAccess.isEmpty()) {
                this.keylessAccess = keylessAccess;
            }
        }

        public String getRemoteStart() {
            return remoteStart;
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }

    }

    public static class Insurance {
        private int validity;
        private double price;
        private int number;
        public void validStrahovka() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите номер страховки в формате 123456789");
            String numberSt = scan.nextLine();
            Pattern pattern = Pattern.compile("[0-9]{9}");
            Matcher matcher2 = pattern.matcher(numberSt);
            if (matcher2.find() == true) {
                System.out.println("номер введён страховки корректно");
            } else {
                throw new NullPointerException("Введите номер страховки по заданным параметрам");
            }
        }
        public void chAutoNumber() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите автомобильный номер в формате х000хх000");
            String autoNumber = scan.nextLine();
            Pattern pattern = Pattern.compile("^[авекмнорстух]{1}[0-9]{3}(?<!0{3})[авекмнорстух]{2}[0-9]{3}$");
            Matcher matcher1 = pattern.matcher(autoNumber);
            if (matcher1.find() == true) {
                System.out.println("номер введён корректно");
            } else {
                throw new NullPointerException("Введите номер автомобиля по заданным параметрам");
            }
        }


        public Insurance(int validity, double price, int number) {
            if (this.validity != 0) {
                this.validity = validity;
            }
            if (price != 0) {
                this.price = price;
            }
            if (number != 0) {
                this.number = number;
            }

        }
        public void checkVal() {
            if (validity <= 2023 && validity >= 2021) {
                System.out.println(" страховка действительна");
            } else {
                System.out.println("страховка истекла оформите новую");
            }
        }


        public int getValidity() {
            return validity;
        }


        public double getPrice() {
            return price;
        }

        public int getNumber() {
            return number;
        }

        public void setValidity(int validity) {
            this.validity = validity;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setNumber(int number) {
            this.number = number;
        }

    }
    private Insurance insurance;

    public Insurance getInsurance() {
        return insurance;
    }


    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

}

