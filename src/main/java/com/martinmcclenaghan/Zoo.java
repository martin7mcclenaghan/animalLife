package com.martinmcclenaghan;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals;

    public List<Animal> getAnimals (){
        return new ArrayList<>(animals);
    }

    public void addAnimal (Animal toAdd){

        this.animals.add(toAdd);
        System.out.println(toAdd.getName() + " has been added to the list");

    }
}
