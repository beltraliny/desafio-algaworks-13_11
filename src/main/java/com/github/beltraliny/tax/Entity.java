package com.github.beltraliny.tax;

public abstract class Entity {

    private String name;

    public Entity(String name) {
        this.name = name;
    }

    public abstract double calculateIncomeTax();

    public String getName() {
        return name;
    }
}
