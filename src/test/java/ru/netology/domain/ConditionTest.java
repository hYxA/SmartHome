package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ConditionTest {
    Condition condition = new Condition();


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
        int expectedTemperature = 25;


        condition.setCurrentTemperature(expectedTemperature);
        assertEquals(expectedTemperature, condition.getCurrentTemperature());

        System.out.println("Hi!");
    }


    @Test
    public void shouldNotChangeField() {
        int expectedTemperature = 0;

        condition.setCurrentTemperature(200);
        assertEquals(expectedTemperature, condition.getCurrentTemperature());

        System.out.println("Hi!");
    }


    @Test
    public void shouldIncreaseCurrentTemperature() {
        int expectDifference = 1;

        condition.setCurrentTemperature(25);
        condition.increaseCurrentTemperature();
        assertEquals(expectDifference, condition.difference);
    }


    @Test
    public void shouldNotIncreaseCurrentTemperature() {
        int expectDifference = 0;

        condition.setCurrentTemperature(32);
        condition.increaseCurrentTemperature();
        assertEquals(expectDifference, condition.difference);
    }


    @Test
    public void shouldDecreaseCurrentTemperature() {
        int expectDifference = 1;

        condition.setCurrentTemperature(25);
        condition.decreaseCurrentTemperature();
        assertEquals(expectDifference, condition.difference);
    }

    @Test
    public void shouldNotDecreaseCurrentTemperature() {
        int expectDifference = 0;

        condition.setCurrentTemperature(16);
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

    @Test
    public void shouldNotSetCurrentTemperatureOverMax() {
        int expectedTemperature = 0;


        condition.setCurrentTemperature(40);
        assertEquals(expectedTemperature, condition.getCurrentTemperature());

    }

    @Test
    public void shouldNotSetCurrentTemperatureLessMin() {
        int expectedTemperature = 0;
        condition.setCurrentTemperature(10);
        assertEquals(expectedTemperature, condition.getCurrentTemperature());
    }
}