package com.pattern.structural.proxy;

public class InternetServiceImpl implements InternetService {

    @Override
    public void connectTo(String url) throws InterruptedException {
        System.out.println("Connecting to : " + url);
    }

    public void scanDownload(String url) {
        System.out.println("Scanning: " + url + " for potential viruses!");
    }
}
