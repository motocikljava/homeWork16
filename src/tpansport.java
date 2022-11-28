public abstract class tpansport {
    String mark;
    String model;
    private int year;
    private String country;
    String color;
    double maxSpeed;

    public  tpansport(String mark, int year, String country, double maxSpeed, String color) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.maxSpeed = maxSpeed;

    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor(String color) {
        return this.color;
    }

    public void setColor(String color) {
        if (this.color != null || !color.isBlank() || !color.isEmpty()) {
            this.color = color;
        }
    }

    public double getMaxSpeed(double maxSpeed) {
        return this.maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        if (this.maxSpeed != 0) {
            this.maxSpeed = maxSpeed;
        }
    }

    public abstract void refil();
}
