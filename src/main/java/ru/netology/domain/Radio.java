package ru.netology.domain;

public class Radio {

    private int currentStation;     // Номер текущей (прослушиваемой) радиостанции
    private int maxStation = 9;     // Максимальный номер радиостанции
    private int minStation = 0;     // Минимальный номер радиостанции
    private int currentVolume;            // Громкость звука
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

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (Radio.this.currentStation > maxStation) {      // Круговая зависимость. После 9 будет номер 0
            return;
        }
        if (Radio.this.currentStation < minStation >) {      // Круговая зависимость. После 0 будет номер 9
            return;
        }
        this.currentStation = Radio.this.currentStation;
    }

    public void setIncreaseCurrentStation(int currentStation) {
        if (Radio.this.currentStation > maxStation) {      // Круговая зависимость. После 9 будет номер 0
            Radio.this.currentStation = 0;
        }
        this.currentStation = Radio.this.currentStation;

    }

    public void setDecreaseCurrentStation(int currentStation) {
        if (Radio.this.currentStation < minStation) {      // Круговая зависимость. После 0 будет номер 9
            Radio.this.currentStation = 9;
        }
        this.currentStation = Radio.this.currentStation;
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

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minStation) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
