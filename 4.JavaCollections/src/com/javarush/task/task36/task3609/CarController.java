package com.javarush.task.task36.task3609;

public class CarController {
    private CarModel model;
    private SpeedometerView view;

    public CarController(CarModel model, SpeedometerView view) {
        this.model = model;
        this.view = view;
    }

    public void increaseSpeed(int seconds) {
        int speed = this.getCarSpeed();
        int maxSpeed = this.getCarMaxSpeed();
        if (speed < maxSpeed) {

            speed += (3.5 * seconds);
            this.setCarSpeed(speed);
        }
        if (speed > maxSpeed) {
            speed = maxSpeed;
            this.setCarSpeed(speed);
        }
    }

    public void decreaseSpeed(int seconds) {
        int speed = this.getCarSpeed();
        if (speed > 0) {
            speed -= (12 * seconds);
            this.setCarSpeed(speed);
        }
        if (speed < 0) {
            this.setCarSpeed(0);
        }
    }

    public String getCarBrand() {
        return model.getBrand();
    }

    public String getCarModel() {
        return model.getModel();
    }

    public void setCarSpeed(int speed) {
        model.setSpeed(speed);
    }

    public int getCarSpeed() {
        return model.getSpeed();
    }

    public int getCarMaxSpeed() {
        return model.getMaxSpeed();
    }

    public void updateView() {
        view.printCarDetails(getCarBrand(), getCarModel(), getCarSpeed());
    }
}