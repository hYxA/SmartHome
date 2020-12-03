package ru.netology.domain.constructor;

public class Conditioner {

    private int id;
    private String name;
    private int maxTemperature = 32;
    private int minTemperature = 12;
    private int currentTemperature = 25;
    private boolean on;

    public Conditioner() {
    }

    public Conditioner(int id, String name, int maxTemperature, int minTemperature, int currentTemperature, boolean on) {
        this.id = id;
        this.name = name;
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
        this.currentTemperature = currentTemperature;
        this.on = on;
    }



}