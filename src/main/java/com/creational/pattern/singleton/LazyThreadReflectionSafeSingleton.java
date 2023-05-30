package com.creational.pattern.singleton;

public class LazyThreadReflectionSafeSingleton {

    //This is an information the Singleton class will hold and will be used
    //by other classes.
    private String data = null;

    //Lazily loaded class. This will be instantiated during the getInstance() method
    //Declare the instance volatile so that it's referenced always from the main memory
    //and not from the cache of a specific thread. Also, volatile will enforce any write to the instance
    //to be flushed to the main memory immediately instead of changing in the thread cache.
    private static volatile LazyThreadReflectionSafeSingleton instance = null;

    //To avoid the class to be instantiated using Reflection
    //by invoking the private Constructor
    private LazyThreadReflectionSafeSingleton() {
        if(instance != null) {
            throw new RuntimeException("Please instantiate using the getInstance() method!");
        }
    }

    //Double check if the instance is null both outside and inside the synchronized block
    //to make sure the instance was not created by another thread just after checking in the
    //if condition.
    public static LazyThreadReflectionSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyThreadReflectionSafeSingleton.class) {
                if (instance == null) {
                    instance = new LazyThreadReflectionSafeSingleton();
                }
            }
        }
        return instance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
