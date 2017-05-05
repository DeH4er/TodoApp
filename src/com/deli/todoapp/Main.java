package com.deli.todoapp;

import com.deli.todoapp.model.Model;
import com.deli.todoapp.model.Record;

public class Main {

    public static void main(String[] args) {
        Model model = new Model();

        Record firstRecord = model.addRecord("First Record!");
        firstRecord.addRow("First row");

        System.out.println(model.getRecordById(0).getTitle());
        System.out.println(model.getRecordById(0).getRowById(0).getText());

    }
}
