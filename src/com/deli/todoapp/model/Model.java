package com.deli.todoapp.model;

import java.util.ArrayList;

/**
 * Created by denys on 05.05.17.
 */
public class Model {
    private ArrayList<Record> list;

    public Record addRecord()
    {
        Record rec = new Record();
        list.add(rec);
        return rec;
    }

    public Record getRecordById(int id)
    {
        Record rec = list.get(id);
        return rec;
    }
    public void deleteRecord(Record rec)
    {
        list.remove(rec);
    }
    public void deleteRecordById(int id)
    {
        list.remove(id);
    }
}
