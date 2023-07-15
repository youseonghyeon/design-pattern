package factorymethod;

public class SportCar extends Car {

    private double zeroToHundred;
    private int maxSpeed;

    public SportCar(String name, String color) {
        setName(name);
        setColor(color);
        setZeroToHundred(2.3D);
        setMaxSpeed(300);
    }

    public double getZeroToHundred() {
        return zeroToHundred;
    }

    public void setZeroToHundred(double zeroToHundred) {
        this.zeroToHundred = zeroToHundred;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "name=" + getName() +
                ", color=" + getColor() +
                ", zeroToHundred=" + zeroToHundred +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
