package com.deli.todoapp.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by denys on 05.05.17.
 */
public class RecordTest {
    @Test
    public void addRow() throws Exception {
        Record record = new Record("");
        Row newRow = record.addRow("Hi");
        assertEquals("Hi", newRow.getText());
    }

    @Test
    public void getRowById() throws Exception {
        Record record = new Record("");
        Row newRow = record.addRow("Hi");
        assertEquals(newRow, record.getRowById(0));
    }

    @Test
    public void deleteRow() throws Exception {
        Record record = new Record("");
        Row newRow = record.addRow("Hi");
        Row newRow2 = record.addRow("Hi 2!");
        record.deleteRow(newRow2);
        record.deleteRow(newRow);
        assertEquals(null, record.getRowById(0));
        assertEquals(null, record.getRowById(1));
    }

    @Test
    public void deleteRowById() throws Exception {
        Record record = new Record("");
        record.addRow("Hi");
        record.addRow("Hi 2!");
        record.deleteRowById(1);
        record.deleteRowById(0);
        record.deleteRowById(-1);
        assertEquals(null, record.getRowById(0));
        assertEquals(null, record.getRowById(1));
    }

    @Test
    public void updateRow() throws Exception {
        Record record = new Record("");
        Row first = record.addRow("Hi");
        record.addRow("Hi 2!");
        record.updateRow(first,"Changed");
        assertEquals("Changed", first.getText());
    }

    @Test
    public void updateRowById() throws Exception {
        Record record = new Record("");
        Row first = record.addRow("Hi");
        record.addRow("Hi 2!");
        record.updateRowById(0,"Changed");
        assertEquals("Changed", first.getText());
    }

}