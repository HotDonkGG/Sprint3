public class CarTimeCalculator {
    private double speed = 25; // средняя скорость в км/ч
    private String courierName;
    private double speedInMS = new SpeedConverter(speed).getSpeedInMs();

    public CarTimeCalculator(String name) {
        courierName = name;
    }

    public long getDeliveryTime(int distanceInMeters) {
        if (distanceInMeters <= 0) {
            return 1;
        }
        return (int)Math.ceil(distanceInMeters / speedInMS);
    }

    public String getCourierName() {
        return courierName;
    }
}