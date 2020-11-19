package ru.netology.domain;

public class Radio {

    private int currentNumber;     // Номер текущей (прослушиваемой) радиостанции
    private int maxNumber = 9;     // Максимальный номер радиостанции
    private int minNumber = 0;     // Минимальный номер радиостанции
    private int volume;            // Громкость звука
    private int maxVolume = 10;         // Максимальная громкость звука
    private int minVolume = 0;         // Минимальная громкость звука


    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        if (currentNumber > maxNumber) {      // Круговая зависимость. После 9 будет номер 0
            currentNumber = 0;
        }
        if (currentNumber < minNumber>) {      // Круговая зависимость. После 0 будет номер 9
            currentNumber = 9;
        }
        this.currentNumber = currentNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > maxVolume) {
            return;
        }
        if (volume < minNumber) {
            return;
        }
        this.volume = volume;
    }
}
