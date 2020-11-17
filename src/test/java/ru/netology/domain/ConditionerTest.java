package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void shouldCreate() {
        Conditioner conditioner = new Conditioner();


        conditioner.currentTemperature = 25;

        System.out.println("Hi!");
    }

    @Test
    public void shouldInit() {
        Conditioner conditioner = new Conditioner();

        assertNull(conditioner.name);
        assertEquals(0, conditioner.maxTemperature);
        assertEquals(0, conditioner.minTemperature);
        assertEquals(0, conditioner.currentTemperature);
        assertFalse(conditioner.on);

        System.out.println("Hi!");
    }

    @Disabled
    @Test

    public void shouldThrowNpe() {
        Conditioner conditioner = new Conditioner();

        assertEquals(0, conditioner.name.length());


        System.out.println("Hi!");
    }

    @Test
    public void shouldChangeField() {
        Conditioner conditioner = new Conditioner();

        assertEquals(0, conditioner.currentTemperature);
        conditioner.currentTemperature = -100;
        assertEquals(-100, conditioner.currentTemperature);


        System.out.println("Hi!");
    }
}