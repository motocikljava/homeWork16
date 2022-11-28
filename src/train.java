public class train extends tpansport{
    int priceTrip;
    String timeTrip;
    String depStation;
    String endStation;
    int vagNumber;

    public train(String model, int year, String country, double maxSpeed, int priceTrip, String depStation, String endStation, int vagNumber, String color) {
        super(model, year, country, maxSpeed, color);
        this.priceTrip = priceTrip;
        this.timeTrip = timeTrip;
        this.depStation = depStation;
        this.endStation = endStation;
        this.vagNumber = vagNumber;
    }

    @Override
    public String toString() {
        return "train{" +
                "priceTrip=" + getPriceTrip() +
                ", depStation='" + getDepStation() + '\'' +
                ", endStation='" + getEndStation() + '\'' +
                ", vagNumber=" + getVagNumber() +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public int getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(int priceTrip) {
        if (priceTrip != 0) {
            this.priceTrip = priceTrip;
        }
        ;
    }

    public String getTimeTrip() {
        return timeTrip;
    }

    public void setTimeTrip(String timeTrip) {
        if (timeTrip != null || !timeTrip.isEmpty() || !timeTrip.isBlank()) {
            this.timeTrip = timeTrip;
        }

    }

    public String getDepStation() {
        return depStation;
    }

    public void setDepStation(String depStation) {
        if (depStation != null || depStation.isBlank() || depStation.isEmpty()) {
            this.depStation = depStation;
        }

    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        if (endStation != null || !endStation.isEmpty() || !endStation.isBlank()) {
            this.endStation = endStation;
        }

    }

    public int getVagNumber() {
        return vagNumber;
    }

    public void setVagNumber(int vagNumber) {
        if (vagNumber != 0) {
            this.vagNumber = vagNumber;
        }
    }

    @Override
    public void refil() {
        System.out.println("заправка дизельным топливом");
    }
}
