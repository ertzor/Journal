package com.example.govert.journal;

import java.io.Serializable;

public class JournalEntry implements Serializable {

    private Integer id;
    private String date;
    private String title;
    private String mood;
    private String entry;

    // constructor to create instance of JournalEntry
    public JournalEntry(Integer id, String date, String title, String mood, String entry) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.mood = mood;
        this.entry = entry;
    }

    public String getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getMood() {
        return mood;
    }

    public String getEntry() {
        return entry;
    }

    public Integer getId() {
        return id;
    }
}
