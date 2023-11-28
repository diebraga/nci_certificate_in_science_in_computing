package softwareDevelopment.week11Lab.BikeApp;

public class MountainBike extends Bike {
    private String suspensionType;

    public MountainBike(String suspensionType) {
        super(); // Call the constructor of the superclass (Bike)
        this.suspensionType = suspensionType;
    }

    public String getSuspensionType() {
        return suspensionType;
    }

    public void setSuspensionType(String suspensionType) {
        this.suspensionType = suspensionType;
    }
}
