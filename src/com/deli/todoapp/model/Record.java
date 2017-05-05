package com.deli.todoapp.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by denys on 05.05.17.
 */
public class Record {
    private List<Row> rows;
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Record(String title) {
        rows = new ArrayList<Row>();
        this.title = title;
    }

    public Row addRow(String text) {
        Row newRow = new Row(text);
        rows.add(newRow);
        return newRow;
    }

    public Row getRowById(int id) {
        if (id >= 0 && id < rows.size()) {
            return rows.get(id);
        } else {
            return null;
        }
    }

    public boolean deleteRow(Row row) {
        if (rows.contains(row)) {
            rows.remove(row);
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteRowById(int id) {
        if (id >= 0 && id < rows.size()) {
            rows.remove(id);
            return true;
        } else {
            return false;
        }
    }

    public void updateRow(Row row, String text) {
        if (rows.contains(row)) {
            row.setText(text);
        }
    }

    public void updateRowById(int id, String text) {
        if (id >= 0 && id < rows.size()) {
            rows.get(id).setText(text);
        }
    }
}
