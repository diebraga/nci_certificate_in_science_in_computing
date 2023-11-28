package softwareDevelopment.week11Lab.BikeApp;

public class Bike {
    private int speed;

    public Bike() {
        this.speed = 0;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed(int increment) {
        this.speed += increment;
    }

    public void decreaseSpeed(int decrement) {
        this.speed -= decrement;
        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}
