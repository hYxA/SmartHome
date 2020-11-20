package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();
    int expectedStation;
    int station;

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
        station = radio.getCurrentStation();
        radio.setNextStation();

    }

    @Test
    public void shouldSetPrevStation() {
    }


    @Test
    public void shouldSetIncreaseVolume() {
    }

    @Test
    public void shouldSetDecreaseVolume() {
    }
}