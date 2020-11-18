package ru.netology.domain;

public class Condition {
    private String name;
    private int maxTemperature = 32;
    private int minTemperature = 16;
    private int currentTemperature = 25;
    private boolean on;
    private int oldTemperature;
    int difference;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) { this.minTemperature = minTemperature; }

    public int getCurrentTemperature() { return currentTemperature; }

    public int getOldTemperature() {
        return oldTemperature;
    }


    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;                                  // завершает выполнение функции
        }
        // здесь уверены, что все проверки прошли
        this.currentTemperature = currentTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int increaseCurrentTemperature() {
        Condition condition = new Condition();
        if (condition.getCurrentTemperature() == condition.getMaxTemperature()) {
            return difference;
        }
        oldTemperature = condition.getCurrentTemperature();
        condition.setCurrentTemperature(24);
        difference =  oldTemperature - condition.getCurrentTemperature();
        return difference;

    }

    public int decreaseCurrentTemperature() {
        Condition condition = new Condition();
        if (condition.getCurrentTemperature() == condition.getMinTemperature()) {
            return difference;
        }
        oldTemperature = condition.getCurrentTemperature();
        condition.setCurrentTemperature(24);
        difference = oldTemperature - condition.getCurrentTemperature();
        return difference;

    }
}
