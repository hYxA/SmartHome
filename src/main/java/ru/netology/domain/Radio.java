package ru.netology.domain;

public class Radio {

    private int currentStation;     // Номер текущей (прослушиваемой) радиостанции
    private int maxStation = 9;     // Максимальный номер радиостанции
    private int minStation = 0;     // Минимальный номер радиостанции
    private int currentVolume;            // Громкость звука
    private int maxVolume = 10;         // Максимальная громкость звука
    private int minVolume = 0;         // Минимальная громкость звука
    int difference;

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

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (Radio.this.currentStation > maxStation) {      // Круговая зависимость. После 9 будет номер 0
            return;
        }
        if (Radio.this.currentStation < minStation) {      // Круговая зависимость. После 0 будет номер 9
            return;
        }
        this.currentStation = currentStation;
    }

    public int setNextStation(int currentStation) {
        if (Radio.this.currentStation > maxStation) {      // Круговая зависимость. После 9 будет номер 0
            Radio.this.currentStation = 0;
        }
        difference = currentStation;
        currentStation += 1;
        difference = currentStation - difference;
        return difference;

    }

    public int setPrevStation(int currentStation) {
        if (Radio.this.currentStation < minStation) {      // Круговая зависимость. После 0 будет номер 9
            Radio.this.currentStation = 9;
        }
        difference = currentStation;
        currentStation -= 1;
        difference = difference - currentStation;
        return difference;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setIncreaseVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        currentVolume += 1;
        this.currentVolume = currentVolume;
    }

    public void setDecreaseVolume(int currentVolume) {

        if (currentVolume < minStation) {
            return;
        }
        currentVolume -= 1;
        this.currentVolume = currentVolume;
    }
}
