package ru.netology.domain;

public class Condition {
    private String name;
    private int maxTemperature = 32;
    private int minTemperature = 16;
    private int currentTemperature;
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

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    /**
     * Установка температуры
     */
    public void setCurrentTemperature(int currentTemperature) {
        Condition condition = new Condition();

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

    /**
     * Увеличение температуры на единицу
     */
    public int increaseCurrentTemperature() {
        Condition condition = new Condition();

        if (currentTemperature == maxTemperature) {
            return difference = 0;
        }

        oldTemperature = currentTemperature;
        currentTemperature += 1; // поменял на переменную непосредственно
        difference = currentTemperature - oldTemperature;
        return difference;

    }

    /**
     * Уменьшение температуры на единицу
     */
    public int decreaseCurrentTemperature() {
        Condition condition = new Condition();

        if (currentTemperature == minTemperature) {
            return difference = 0;
        }

        oldTemperature = currentTemperature;
        currentTemperature -= 1; // поменял на переменную непосредственно
        difference = oldTemperature - currentTemperature;
        return difference;

    }
}
