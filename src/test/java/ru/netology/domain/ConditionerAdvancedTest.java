package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerAdvancedTest {


    @Test
    public void shouldCreate() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        String expectedName = "Кондёр";

        assertNull(conditioner.getName());
        conditioner.setName(expectedName);

        assertEquals(expectedName, conditioner.getName());


        System.out.println("Hi!");
    }

    @Test
    public void shouldChangeField() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(-100);
        assertEquals(-100, conditioner.getCurrentTemperature());


        System.out.println("Hi!");
    }
}