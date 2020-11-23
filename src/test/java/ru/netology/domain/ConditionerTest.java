package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ConditionerTest {
    Conditioner conditioner = new Conditioner();


    @Test
    public void shouldCreate() {
        String expectedName = "Кондёр";

        assertNull(conditioner.getName());
        conditioner.setName(expectedName);

        assertEquals(expectedName, conditioner.getName());

        System.out.println("Hi!");
    }


    @Test
    public void shouldChangeField() {
        int expectedTemperature = 25;


        conditioner.setCurrentTemperature(expectedTemperature);
        assertEquals(expectedTemperature, conditioner.getCurrentTemperature());

        System.out.println("Hi!");
    }


    @Test
    public void shouldNotChangeField() {
        int expectedTemperature = 0;

        conditioner.setCurrentTemperature(200);
        assertEquals(expectedTemperature, conditioner.getCurrentTemperature());

        System.out.println("Hi!");
    }


    @Test
    public void shouldIncreaseCurrentTemperature() {
        int expectTemperature = conditioner.getCurrentTemperature() + 1;

        conditioner.increaseCurrentTemperature();
        assertEquals(expectTemperature, conditioner.getCurrentTemperature());
    }


    @Test
    public void shouldNotIncreaseCurrentTemperature() {
        conditioner.setCurrentTemperature(conditioner.getMaxTemperature());

        conditioner.increaseCurrentTemperature();
        assertEquals(conditioner.getMaxTemperature(), conditioner.getCurrentTemperature());
    }


    @Test
    public void shouldDecreaseCurrentTemperature() {
        int expectTemperature = conditioner.getCurrentTemperature() - 1;

        conditioner.decreaseCurrentTemperature();
        assertEquals(expectTemperature, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldNotDecreaseCurrentTemperature() {
        int expectDifference = 0;

        conditioner.setCurrentTemperature(16);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expectDifference, conditioner.difference);
    }

    @Test
    public void shouldSetMaxTemperature() {
        conditioner.setMaxTemperature(35);
        assertEquals(35, conditioner.getMaxTemperature());

    }

    @Test
    public void shouldSetMinTemperature() {
        conditioner.setMinTemperature(15);
        assertEquals(15, conditioner.getMinTemperature());

    }

    @Test
    public void shouldNotSetCurrentTemperatureOverMax() {
        int expectedTemperature = 0;


        conditioner.setCurrentTemperature(40);
        assertEquals(expectedTemperature, conditioner.getCurrentTemperature());

    }

    @Test
    public void shouldNotSetCurrentTemperatureLessMin() {
        int expectedTemperature = 0;
        conditioner.setCurrentTemperature(10);
        assertEquals(expectedTemperature, conditioner.getCurrentTemperature());
    }
}