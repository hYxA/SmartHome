package ru.netology.domain;

public class Radio {

    private int currentStation;     // Номер текущей (прослушиваемой) радиостанции
    private int maxStation = 10;    // Максимальный номер радиостанции
    private int minStation = 0;     // Минимальный номер радиостанции
    private int currentVolume;      // Громкость звука
    private int maxVolume = 100;     // Максимальная громкость звука
    private int minVolume = 0;      // Минимальная громкость звука

    public Radio() {
    }

    public Radio(int currentStation, int maxStation, int minStation, int currentVolume, int maxVolume, int minVolume) {
        this.currentStation = currentStation;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }


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

    /**
     * Установка количества радиостанций
     */
    public void setCountStation(int maxStation) {
        if (1 > maxStation) {
            return;
        }

        this.maxStation = maxStation;
    }

    /**
     * Установка радиостанции с цифровых кнопок
     */
    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    /**
     * Переключение на следущую радиостанцию
     */
    public void setNextStation() {
        if (currentStation == maxStation) {      // Круговая зависимость. После 9 будет номер 0
            currentStation = minStation;
            return;
        }
        currentStation += 1;
    }

    /**
     * Переключение на предыдущую радиостанцию
     */
    public void setPrevStation() {
        if (currentStation == minStation) {      // Круговая зависимость. После 9 будет номер 0
            currentStation = maxStation;
            return;
        }
        currentStation -= 1;
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

    /**
     * Увеличение громкости на единицу
     */
    public void setIncreaseVolume() {

        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume += 1;
    }

    /**
     * Уменьшение громкости на единицу
     */
    public void setDecreaseVolume() {

        if (currentVolume == minVolume) {
            return;
        }
        currentVolume -= 1;
    }

    /**
     * Установка громкости
     * Только для упрощения тестов!
     * Пользователю недоступно!
     */
    public void setVolume(int currentVolume) {

        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
