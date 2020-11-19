package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ConditionTest {
    int expectedTemperature = 25;
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

        assertEquals(expectedTemperature, condition.getCurrentTemperature());
        condition.setCurrentTemperature(26);
        assertEquals(26, condition.getCurrentTemperature());

        System.out.println("Hi!");
    }


    @Test
    public void shouldNotChangeField() {

        assertEquals(expectedTemperature, condition.getCurrentTemperature());
        condition.setCurrentTemperature(0);
        assertEquals(expectedTemperature, condition.getCurrentTemperature());

        System.out.println("Hi!");
    }


    @Test
    public void shouldIncreaseCurrentTemperature() {

        int expectDifference = 1;
        condition.increaseCurrentTemperature();
        assertEquals(expectDifference, condition.difference);
    }


    @Test
    public void shouldNotIncreaseCurrentTemperature() {
        condition.setCurrentTemperature(40);
        int expectDifference = 0;

        condition.decreaseCurrentTemperature();
        assertEquals(expectDifference, condition.difference);
    }


    @Test
    public void shouldDecreaseCurrentTemperature() {

        int expectDifference = 0;
        condition.decreaseCurrentTemperature();
        assertEquals(expectDifference, condition.difference);
    }

    @Test
    public void shouldNotDecreaseCurrentTemperature() {
        condition.setCurrentTemperature(16);
        int expectDifference = 0;

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
    public void shouldNotSetCurrentTemperature() {

        condition.setCurrentTemperature(40);
        assertEquals(expectedTemperature, condition.getCurrentTemperature());

        condition.setCurrentTemperature(10);
        assertEquals(expectedTemperature, condition.getCurrentTemperature());
    }
}