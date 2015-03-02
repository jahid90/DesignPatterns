package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 3/2/2015.
 */
public class Duck implements Comparable {
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " weighs " + weight;
    }

    @Override
    public int compareTo(Object o) {
        Duck otherDuck = (Duck) o;

        if (this.weight < otherDuck.weight) {
            return -1;
        }
        else if (this.weight == otherDuck.weight) {
            return this.name.compareTo(otherDuck.name);
        }
        else {
            return 1;
        }
    }
}
