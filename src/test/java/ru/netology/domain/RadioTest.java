package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();
    int expectedVolume;
    int expectedStation;

    /**
     * Тест на установку количества  станций
     */
    @Test
    public void shouldSetCountStation() {
        expectedStation = 10;

        radio.setCountStation(expectedStation);

        assertEquals(expectedStation, radio.getMaxStation());
    }

    @Test
    public void shouldNOTSetCountStation() {
        expectedStation = radio.getMaxStation();

        radio.setCountStation(-5);

        assertEquals(expectedStation, radio.getMaxStation());
    }

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

        expectedStation = radio.getCurrentStation();
        radio.setCurrentStation(30);

        assertEquals(expectedStation, radio.getCurrentStation());
    }

    /**
     * Тест на установку станции с цифровых кнопок
     * с превышением минимального значения
     */
    @Test
    public void shouldNOTSetCurrentStationLessThenMin() {
        int station = -30;

        expectedStation = radio.getCurrentStation();
        radio.setCurrentStation(station);

        assertEquals(expectedStation, radio.getCurrentStation());
    }

    /**
     * Проверка граничных значений номера станции
     */
    @Test
    public void shouldSetCurrentStationLowerLimit() {
        expectedStation = radio.getMinStation();

        radio.setCurrentStation(expectedStation);

        assertEquals(expectedStation, radio.getCurrentStation());
    }

    /**
     * Проверка граничных значений номера станции
     */
    @Test
    public void shouldSetCurrentStationUpperLimit() {
        expectedStation = radio.getMaxStation();

        radio.setCurrentStation(expectedStation);

        assertEquals(expectedStation, radio.getCurrentStation());
    }

    /**
     * Проверка переключения на следущую станцию
     * <p>
     * 5я радиостанция выставляется для исключения граничного значения
     */
    @Test
    public void shouldSetNextStation() {
        radio.setCurrentStation(5);
        expectedStation = radio.getCurrentStation() + 1;
        radio.setNextStation();

        assertEquals(expectedStation, radio.getCurrentStation());
    }

    /**
     * Проверка переключения на предыдущую станцию
     * 5я радиостанция выставляется для исключения граничного значения
     * и срабатывания условных операторов
     */
    @Test
    public void shouldSetPrevStation() {
        radio.setCurrentStation(5);
        expectedStation = radio.getCurrentStation() - 1;
        radio.setPrevStation();

        assertEquals(expectedStation, radio.getCurrentStation());
    }

    /**
     * Проверка переключения станции
     * по циклической зависимости 0-9
     */
    @Test
    public void shouldSetPrevStationAfterZero() {
        expectedStation = radio.getMaxStation();
        radio.setCurrentStation(0);
        radio.setPrevStation();

        assertEquals(expectedStation, radio.getCurrentStation());
    }

    /**
     * Проверка переключения станции
     * по циклической зависимости 9-0
     */
    @Test
    public void shouldSetNextStationAfterMax() {
        expectedStation = radio.getMinStation();
        radio.setCurrentStation(radio.getMaxStation());
        radio.setNextStation();

        assertEquals(expectedStation, radio.getCurrentStation());
    }

    /**
     * Проверка увеличения громкости на единицу
     */
    @Test
    public void shouldSetIncreaseVolume() {
        radio.setVolume(20);         // установка числа между min и max градусов

        expectedVolume = radio.getCurrentVolume() + 1;
        radio.setIncreaseVolume();

        assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    /**
     * Проверка уменьшения громкости на единицу
     */
    @Test
    public void shouldSetDecreaseVolume() {
        radio.setVolume(20);         // установка числа между min и max градусов

        expectedVolume = radio.getCurrentVolume() - 1;
        radio.setDecreaseVolume();

        assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    /**
     * Проверка увеличения громкости на единицу
     * при максимальном значении
     */
    @Test
    public void shouldNOTSetIncreaseVolumeMoreThanMax() {
        expectedVolume = radio.getMaxVolume();
        radio.setVolume(radio.getMaxVolume());
        radio.setIncreaseVolume();

        assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    /**
     * Проверка уменьшения громкости на единицу
     * при минимальном значении
     */
    @Test
    public void shouldNOTSetDecreaseVolumeLessThanMin() {
        expectedVolume = radio.getMinVolume();
        radio.setVolume(radio.getMinVolume());
        radio.setDecreaseVolume();

        assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    /**
     * Проверка установки громкости выше максимальновозможного значения
     */
    @Test
    public void shouldNotSetVolumeMoreThanMax() {
        expectedVolume = radio.getCurrentVolume();
        radio.setVolume(radio.getMaxVolume()+50);

        assertEquals(expectedVolume, radio.getCurrentVolume());
    }

     /**
     * Проверка установки громкости ниже минимальновозможного значения
     */
    @Test
    public void shouldNotSetVolumeLessThanMin() {
        expectedVolume = radio.getCurrentVolume();
        radio.setVolume(-50);

        assertEquals(expectedVolume, radio.getCurrentVolume());
    }

}