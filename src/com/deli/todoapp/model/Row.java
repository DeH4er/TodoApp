package com.deli.todoapp.model;

/**
 * Created by denys on 05.05.17.
 */
public class Row {
    private String text;
    private boolean checked;

    public Row(String text) {
        this.text = text;
        checked = false;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
