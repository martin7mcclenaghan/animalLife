package com.martinmcclenaghan;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeNoise();

    public String getName() {
        return name;
    }
}
