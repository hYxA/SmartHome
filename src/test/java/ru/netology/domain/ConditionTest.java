package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ConditionTest {
    int expectedTemperature = 25;

    @Test
    public void shouldCreate() {
        Condition conditioner = new Condition();
        String expectedName = "Кондёр";

        assertNull(conditioner.getName());
        conditioner.setName(expectedName);

        assertEquals(expectedName, conditioner.getName());


        System.out.println("Hi!");
    }

    @Test
    public void shouldChangeField() {
        Condition conditioner = new Condition();

        assertEquals(expectedTemperature, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(26);
        assertEquals(26, conditioner.getCurrentTemperature());


        System.out.println("Hi!");
    }

    @Test
    public void shouldNotChangeField() {
        Condition condition = new Condition();

        assertEquals(expectedTemperature, condition.getCurrentTemperature());
        condition.setCurrentTemperature(0);
        assertEquals(expectedTemperature, condition.getCurrentTemperature());


        System.out.println("Hi!");
    }

    @Test
    public void shouldIncreaseCurrentTemperature() {
        Condition condition = new Condition();


        int expectDifference = 1;
        condition.increaseCurrentTemperature();
        assertEquals(expectDifference, condition.difference);
    }

    @Test
    public void shouldDecreaseCurrentTemperature() {
        Condition condition = new Condition();


        int expectDifference = 1;
        condition.decreaseCurrentTemperature();
        assertEquals(expectDifference, condition.difference);
    }

    @Test
    public void shouldNotDecreaseCurrentTemperature() {
        Condition condition = new Condition();
        condition.setCurrentTemperature(16);
        int expectDifference = 0;

        condition.decreaseCurrentTemperature();
        assertEquals(expectDifference, condition.difference);
    }

    @Test
    public void shouldSetMaxTemperature() {
        Condition condition = new Condition();
        condition.setMaxTemperature(35);
        assertEquals(35, condition.getMaxTemperature());

    }

    @Test
    public void shouldSetMinTemperature() {
        Condition condition = new Condition();
        condition.setMinTemperature(15);
        assertEquals(15, condition.getMinTemperature());

    }

    @Test
    public void shouldNotSetCurrentTemperature() {
        Condition condition = new Condition();

        condition.setCurrentTemperature(40);
        assertEquals(expectedTemperature, condition.getCurrentTemperature());

        condition.setCurrentTemperature(10);
        assertEquals(expectedTemperature, condition.getCurrentTemperature());
    }
}