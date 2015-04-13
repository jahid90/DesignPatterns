package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 2/24/2015.
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (null == uniqueInstance) {
            uniqueInstance = new Singleton();       // lazy instantiation
        }

        return uniqueInstance;
    }
}
