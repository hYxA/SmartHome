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
    public int setNextStation() {
        difference = currentStation;
        if (Radio.this.currentStation == maxStation) {      // Круговая зависимость. После 9 будет номер 0
            Radio.this.currentStation = 0;
            return 1;
        } else {
        currentStation += 1;
        difference = currentStation - difference;
        }
        return difference;

    }

    /**
     * Переключение на предыдущую радиостанцию
     */
    public int setPrevStation() {
        difference = currentStation;
        if (Radio.this.currentStation == minStation) {      // Круговая зависимость. После 0 будет номер 9
            Radio.this.currentStation = 9;
            return 1;
        } else {
        currentStation -= 1;
        difference = difference - currentStation;
        }
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

    /**
     * Увеличение громкости на единицу
     */
    public int setIncreaseVolume() {

        if (currentVolume == maxVolume) {
            return 0;
        }

        difference = currentVolume;
        currentVolume += 1;
        difference = currentVolume - difference;

        return difference;
    }

    /**
     * Уменьшение громкости на единицу
     */
    public int setDecreaseVolume() {

        if (currentVolume == minVolume) {
            return 0;
        }

        difference = currentVolume;
        currentVolume -= 1;
        difference = difference - currentVolume;

        return difference;
    }

    /**
     * Установка громкости
     *
     * Только для упрощения тестов!
     * Пользователю недоступно!
     */
    public void setVolume(int currentVolume) {

        if (currentVolume < minStation) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }

        this.currentVolume = currentVolume;
    }
}
