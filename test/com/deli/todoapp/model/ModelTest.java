package com.deli.todoapp.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by denys on 05.05.17.
 */
public class ModelTest {

    @Test
    public void test_addRecord() {

        Model model = new Model();
        Record newRecord = model.addRecord("asd");
        assertEquals(newRecord, model.getRecordById(0));

    }

}