package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ConditionTest {


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

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(25);
        assertEquals(25, conditioner.getCurrentTemperature());


        System.out.println("Hi!");
    }

    @Test
    public void shouldNotChangeField() {
        Condition condition = new Condition();

        assertEquals(0, condition.getCurrentTemperature());
        condition.setCurrentTemperature(0);
        assertEquals(0, condition.getCurrentTemperature());


        System.out.println("Hi!");
    }

    @Test
    public void increaseCurrentTemperature() {
        Condition condition = new Condition();
        if (condition.getCurrentTemperature() == condition.getMaxTemperature()) {
            return;
        }
        assertEquals( 0, condition.difference);
    }

    @Test
    public void decreaseCurrentTemperature() {
        Condition condition = new Condition();
        if (condition.getCurrentTemperature() == condition.getMinTemperature()) {
            return;
        }
        assertEquals( 0, condition.difference);
    }
}