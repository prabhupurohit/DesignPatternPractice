package com.creational.pattern.singleton;

public class SingletonDemoApp {

    public static void main(String[] args) {
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        singleton1.setData("Prabhu");
        System.out.println("Singleton holds the data: " + singleton1.getData());

        LazyThreadReflectionSafeSingleton singleton2 = LazyThreadReflectionSafeSingleton.getInstance();
        singleton2.setData("Prabhu");
        System.out.println("Singleton holds the data: " + singleton2.getData());
    }

}
