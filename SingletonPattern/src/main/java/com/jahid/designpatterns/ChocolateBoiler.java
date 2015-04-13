package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 2/24/2015.
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private volatile static ChocolateBoiler uniqueInstance;
    //private static ChocolateBoiler uniqueInstance = new ChocolateBoiler();

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (null == uniqueInstance) {
            synchronized (Singleton.class) {
                if (null == uniqueInstance) {
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }

        return uniqueInstance;
    }

    /*public static synchronized ChocolateBoiler getInstance() {
        if (null == uniqueInstance) {
            uniqueInstance = new ChocolateBoiler();
        }

        return uniqueInstance;
    }*/

    /*public static ChocolateBoiler getInstance() {
        return uniqueInstance;
    }*/

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }
}
