package com.example.demo;


public class MemoDto {
    private int id;
    private String text;

    public MemoDto() {
    }

    public MemoDto(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public MemoDto setId(int id) {
        this.id = id;
        return this;
    }

    public String getText() {
        return text;
    }

    public MemoDto setText(String text) {
        this.text = text;
        return this;
    }
}
