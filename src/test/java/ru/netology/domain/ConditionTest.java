package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ConditionTest {
    int expectedTemperature;
    Condition condition = new Condition();
    int expectDifference;


    @Test
    public void shouldCreate() {
        String expectedName = "Кондёр";

        assertNull(condition.getName());
        condition.setName(expectedName);

        assertEquals(expectedName, condition.getName());

        System.out.println("Hi!");
    }


    @Test
    public void shouldChangeField() {

        expectedTemperature = 26;
        condition.setCurrentTemperature(expectedTemperature);
        assertEquals(26, condition.getCurrentTemperature());

        System.out.println("Hi!");
    }


    @Test
    public void shouldNotSetCurrentTemperatureLessThanMin() {

        expectedTemperature = condition.getCurrentTemperature();
        condition.setCurrentTemperature(0);
        assertEquals(expectedTemperature, condition.getCurrentTemperature());
    }

    @Test
    public void shouldNotSetCurrentTemperatureMoreThanMax() {

        expectedTemperature = condition.getCurrentTemperature();
        condition.setCurrentTemperature(50);
        assertEquals(expectedTemperature, condition.getCurrentTemperature());
    }


    @Test
    public void shouldIncreaseCurrentTemperature() {
        condition.setCurrentTemperature(24);

        expectDifference = 1;
        condition.increaseCurrentTemperature();
        assertEquals(expectDifference, condition.difference);
    }

    @Test
    public void shouldNotIncreaseCurrentTemperature() {

        int expectDifference = 0;
        condition.setCurrentTemperature(condition.getMaxTemperature());
        condition.increaseCurrentTemperature();
        assertEquals(expectDifference, condition.difference);
    }

    @Test
    public void shouldNotDecreaseCurrentTemperature() {

        expectDifference = 0;
        condition.setCurrentTemperature(condition.getMinTemperature());
        condition.decreaseCurrentTemperature();
        assertEquals(expectDifference, condition.difference);
    }


    @Test
    public void shouldDecreaseCurrentTemperature() {

        int expectDifference = 1;
        condition.decreaseCurrentTemperature();
        assertEquals(expectDifference, condition.difference);
    }

    @Test
    public void shouldSetMaxTemperature() {
        condition.setMaxTemperature(35);
        assertEquals(35, condition.getMaxTemperature());

    }

    @Test
    public void shouldSetMinTemperature() {
        condition.setMinTemperature(15);
        assertEquals(15, condition.getMinTemperature());

    }


}