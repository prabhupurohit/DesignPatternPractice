package com.pattern.creational.singleton;

public class EagerSingleton {

    //This is an information the Singleton class will hold and will be used
    //by other classes
    private String data = null;

    //Eagerly create the instance of the Singleton class at class loading time
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        if (instance != null) {
            return instance;
        } else {
            return new EagerSingleton();
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
