package org.zlasu.car;

public class Car {

    private int id;
    private int maxSpeed;
    private String brand;

    public Car(int id, int maxSpeed, String brand) {
        this.id = id;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
