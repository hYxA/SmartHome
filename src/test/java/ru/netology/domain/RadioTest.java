package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();
    int expectedStation;


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
        expectedStation = 9;
        radio.setCurrentStation(0);
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
        radio.setNextStation();

        assertEquals(expectedStation, radio.getCurrentStation());
    }

    /**
     * Проверка увеличения громкости на единицу
     */
    @Test
    public void shouldSetIncreaseVolume() {
        int expectedVolume = 6;
        radio.setVolume(5);
        radio.setIncreaseVolume();

        assertEquals(expectedVolume, radio.getCurrentVolume());

    }

    /**
     * Проверка уменьшения громкости на единицу
     */
    @Test
    public void shouldSetDecreaseVolume() {
        int expectedVolume = 4;
        radio.setVolume(5);
        radio.setDecreaseVolume();

        assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    /**
     * Проверка увеличения громкости на единицу
     * при максимальном значении
     */
    @Test
    public void shouldNOTSetIncreaseVolume() {
        int expectedVolume = 10;
        radio.setVolume(10);
        radio.setIncreaseVolume();

        assertEquals(expectedVolume, radio.getCurrentVolume());

    }

    /**
     * Проверка уменьшения громкости на единицу
     * при минимальном значении
     */
    @Test
    public void shouldNOTSetDecreaseVolume() {
        int expectedVolume = 0;
        radio.setVolume(0);
        radio.setDecreaseVolume();

        assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    /**
     * Проверка установки громкости выше максимальновозможного значения
     */
    @Test
    public void shouldNotSetVolumeMoreThanMax() {
        int expectedVolume = radio.getCurrentVolume();
        radio.setVolume(50);

        assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    /**
     * Проверка установки громкости ниже минимальновозможного значения
     */
    @Test
    public void shouldNotSetVolumeLessThanMin() {
        int expectedVolume = radio.getCurrentVolume();
        radio.setVolume(-50);

        assertEquals(expectedVolume, radio.getCurrentVolume());
    }

}