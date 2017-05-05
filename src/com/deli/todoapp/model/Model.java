package com.deli.todoapp.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by denys on 05.05.17.
 */
public class Model {
    private List<Record> records;

    public Model() {
        records = new ArrayList<Record>();
    }

    public Record addRecord(String title) {
        Record record = new Record(title);
        records.add(record);
        return record;
    }

    public Record getRecordById(int id) {
        if (id >= 0 && id < records.size()) {
            return records.get(id);
        } else {
            return null;
        }
    }

    public boolean deleteRecord(Record record) {
        if (records.contains(record)) {
            records.remove(record);
            return true;
        } else {
            return false;
        }
    }
    public boolean deleteRecordById(int id) {
        if (id >= 0 && id < records.size()) {
            records.remove(id);
            return true;
        } else {
            return false;
        }
    }
}
