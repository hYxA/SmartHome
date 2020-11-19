package ru.netology.domain;

public class Radio {

    private int number; //  Номер текущей (прослушиваемой) радиостанции
    private int volume; //  Громкость звука


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
