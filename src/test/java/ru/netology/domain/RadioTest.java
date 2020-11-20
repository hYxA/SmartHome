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

    @Test
    public void shouldNOTSetCurrentStationMoreThanMax() {
        station = 30;

        expectedStation = radio.getCurrentStation();
        radio.setCurrentStation(station);

        assertEquals(expectedStation, radio.getCurrentStation());

    }

    @Test
    public void shouldNOTSetCurrentStationLessThenMin() {
        station = -30;

        expectedStation = radio.getCurrentStation();
        radio.setCurrentStation(station);

        assertEquals(expectedStation, radio.getCurrentStation());

    }

    @Test
    public void shouldSetCurrentStationLowerLimit() {
        expectedStation = 0;

        radio.setCurrentStation(expectedStation);

        assertEquals(expectedStation, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationUpperLimit() {
        expectedStation = 9;

        radio.setCurrentStation(expectedStation);

        assertEquals(expectedStation, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStation() {
        radio.setCurrentStation(5);
        station = radio.getCurrentStation();
        radio.setNextStation();

        assertEquals(expectedDifference, radio.difference);
    }

    @Test
    public void shouldSetPrevStation() {
        radio.setCurrentStation(5);
        station = radio.getCurrentStation();
        radio.setNextStation();

        assertEquals(expectedDifference, radio.difference);
    }

    @Test
    public void shouldSetPrevStationAfterZero() {
        expectedStation = 9;
        radio.setCurrentStation(0);
        station = radio.getCurrentStation();
        radio.setNextStation();

        assertEquals(expectedStation, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationAfterNine() {
        expectedStation = 0;
        radio.setCurrentStation(9);
        station = radio.getCurrentStation();
        radio.setNextStation();

        assertEquals(expectedStation, radio.getCurrentStation());
    }


    @Test
    public void shouldSetIncreaseVolume() {
    }

    @Test
    public void shouldSetDecreaseVolume() {
    }
}