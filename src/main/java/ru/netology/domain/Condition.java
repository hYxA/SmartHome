package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Condition {
    private String name;
    private int maxTemperature = 32;
    private int minTemperature = 16;
    private int currentTemperature;
    private boolean on;
    private int oldTemperature;
    int difference;

    /**
     * Установка текущей температуры
     */
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

    /**
     * Увеличение температуры на единицу
     */
    public int increaseCurrentTemperature() {
        if (currentTemperature == maxTemperature) {
            return difference = 0;
        }

        oldTemperature = currentTemperature;
        currentTemperature += 1;
        difference = currentTemperature - oldTemperature;
        return difference;
    }

    /**
     * Уменьшение температуры на единицу
     */
    public int decreaseCurrentTemperature() {
        if (currentTemperature == minTemperature) {
            return difference = 0;
        }

        oldTemperature = currentTemperature;
        currentTemperature -= 1;
        difference = oldTemperature - currentTemperature;
        return difference;
    }
}
