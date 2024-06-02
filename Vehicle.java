public class Vehicle {
    private String vehicleType;
    private int topSpeed;
    private int range;

    public Vehicle(){
        vehicleType = "Unknown";
        topSpeed = 300;
        range = 5;
    }

    public Vehicle(String vehicleType, int topSpeed, int range) {
        this.vehicleType = vehicleType;
        this.topSpeed = topSpeed;
        this.range = range;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}