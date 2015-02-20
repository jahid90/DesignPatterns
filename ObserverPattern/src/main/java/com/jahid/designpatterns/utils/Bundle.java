package com.jahid.designpatterns.utils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by jahidul.s on 2/20/2015.
 */
public class Bundle implements Serializable {
    private Map<Integer, Object> dataMap;

    public Bundle() {
        dataMap = new HashMap<Integer, Object>();
    }

    public void put(Integer key, Object value) {
        dataMap.put(key, value);
    }

    public Object get(Integer key) {
        return dataMap.get(key);
    }

    public Set<Integer> getKeys() {
        return dataMap.keySet();
    }
}
