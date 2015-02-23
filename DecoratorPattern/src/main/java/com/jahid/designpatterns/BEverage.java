package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 2/23/2015.
 */
public abstract class Beverage {
    public static final int TALL = 0;
    public static final int GRANDE = 1;
    public static final int VENTI = 2;

    private String description = "Unknown Beverage";
    private int size;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract double cost();
}
