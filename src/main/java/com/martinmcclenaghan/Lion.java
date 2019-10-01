package com.martinmcclenaghan;

public class Lion extends Animal {

    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("ROAR");
    }
}
