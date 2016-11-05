package com.example.wington.actionbarsetting;

import java.io.Serializable;

/**
 * Created by wington on 11/5/16.
 */

public class User implements Serializable {
    private final static long serialVersionUID = -3469237L;
    String name;
    String color;

    public User(String name, String color){
        this.name = name;
        this.color = color;
    }
}
