package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 2/18/2015.
 */
public interface Subject {
    public void registerObserver(Observer addObserver);

    public void removeObserver(Observer removeObserver);

    public void notifyObservers();
}
