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

}