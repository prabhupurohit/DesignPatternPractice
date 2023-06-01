package com.pattern.structural.proxy;

public class ProxyDemo {
    public static void main(String[] args) {

        try {
            //Create an Internet Service without Proxy
            InternetService internetService = new InternetServiceImpl();
            internetService.connectTo("https://www.google.com");

            //Create an Internet Service with a Proxy
            InternetServiceImpl internetService1 = new InternetServiceImpl();

            //Create a proxy
            InternetService internet = new InternetProxy(internetService1);
            internet.connectTo("http://www.unsecure.com");
            internet.connectTo("https://www.facebook.com");
            internet.connectTo("https://www.secure.com");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
