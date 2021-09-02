package com.tools.models;

public class Board {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Board{" +
                "name='" + name + '\'' +
                '}';
    }
}
