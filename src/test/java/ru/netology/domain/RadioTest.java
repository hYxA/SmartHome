package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();
    int expectedStation;
    int station;
    int expectedDifference = 1;


    /**
     * Тест на обычную установку станции с цифровых кнопок
     */
    @Test
    public void shouldSetCurrentStation() {
        expectedStation = 3;

        radio.setCurrentStation(expectedStation);

        assertEquals(expectedStation, radio.getCurrentStation());

    }

    /**
     * Тест на установку станции с цифровых кнопок
     * с превышением максимального значения
     */
    @Test
    public void shouldNOTSetCurrentStationMoreThanMax() {
        station = 30;

        expectedStation = radio.getCurrentStation();
        radio.setCurrentStation(station);

        assertEquals(expectedStation, radio.getCurrentStation());

    }

    /**
     * Тест на установку станции с цифровых кнопок
     * с превышением минимального значения
     */
    @Test
    public void shouldNOTSetCurrentStationLessThenMin() {
        station = -30;

        expectedStation = radio.getCurrentStation();
        radio.setCurrentStation(station);

        assertEquals(expectedStation, radio.getCurrentStation());

    }

    /**
     * Проверка граничных значений номера станции
     */
    @Test
    public void shouldSetCurrentStationLowerLimit() {
        expectedStation = 0;

        radio.setCurrentStation(expectedStation);

        assertEquals(expectedStation, radio.getCurrentStation());
    }

    /**
     * Проверка граничных значений номера станции
     */
    @Test
    public void shouldSetCurrentStationUpperLimit() {
        expectedStation = 9;

        radio.setCurrentStation(expectedStation);

        assertEquals(expectedStation, radio.getCurrentStation());
    }

    /**
     * Проверка переключения на следущую станцию
     *
     * 5я радиостанция выставляется для исключения граничного значения
     */
    @Test
    public void shouldSetNextStation() {
        radio.setCurrentStation(5);
        station = radio.getCurrentStation();
        radio.setNextStation();

        assertEquals(expectedDifference, radio.difference);
    }

    /**
     * Проверка переключения на предыдущую станцию
     * 5я радиостанция выставляется для исключения граничного значения
     */
    @Test
    public void shouldSetPrevStation() {
        radio.setCurrentStation(5);
        station = radio.getCurrentStation();
        radio.setNextStation();

        assertEquals(expectedDifference, radio.difference);
    }

    /**
     * Проверка переключения станции
     * по циклической зависимости 0-9
     */
    @Test
    public void shouldSetPrevStationAfterZero() {
        expectedStation = 9;
        radio.setCurrentStation(0);
        station = radio.getCurrentStation();
        radio.setPrevStation();

        assertEquals(expectedStation, radio.getCurrentStation());
    }

    /**
     * Проверка переключения станции
     * по циклической зависимости 9-0
     */
    @Test
    public void shouldSetNextStationAfterNine() {
        expectedStation = 0;
        radio.setCurrentStation(9);
        station = radio.getCurrentStation();
        radio.setNextStation();

        assertEquals(expectedStation, radio.getCurrentStation());
    }

    /**
     * Проверка увеличения громкости на единицу
     */
    @Test
    public void shouldSetIncreaseVolume() {
        radio.setVolume(5);
        radio.setIncreaseVolume();

        assertEquals(expectedDifference, radio.difference);

    }

    /**
     * Проверка уменьшения громкости на единицу
     */
    @Test
    public void shouldSetDecreaseVolume() {
        radio.setVolume(5);
        radio.setDecreaseVolume();

        assertEquals(expectedDifference, radio.difference);
    }

    /**
     * Проверка увеличения громкости на единицу
     * при максимальном значении
     */
    @Test
    public void shouldNOTSetIncreaseVolume() {
        radio.setVolume(10);
        radio.setIncreaseVolume();

        assertEquals(10, radio.getCurrentVolume());

    }

    /**
     * Проверка уменьшения громкости на единицу
     * при минимальном значении
     */
    @Test
    public void shouldNOTSetDecreaseVolume() {
        radio.setVolume(0);
        radio.setDecreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }
}