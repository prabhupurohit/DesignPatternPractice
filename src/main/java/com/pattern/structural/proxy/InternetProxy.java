package com.pattern.structural.proxy;

import java.util.Arrays;
import java.util.List;

public class InternetProxy implements InternetService {

    //This can hold the InternetService Interface
    //if the Actual Implementation doesn't have additional methods than the interface
    //InternetService internetService;

    InternetServiceImpl internetServiceImpl;

    public InternetProxy(InternetServiceImpl internetServiceImpl) {
        this.internetServiceImpl = internetServiceImpl;
    }

    @Override
    public void connectTo(String url) throws InterruptedException {
        //Do not allow http://
        if (url != null && url.split(":")[0].equals("http")) {
            System.out.println("URL is not secured");
        } else if (bannedUrl.stream().filter(u -> u.equals(url)).count() > 0) {
            System.out.println("The URL: " + url + " is blocked!");
        } else {
            internetServiceImpl.connectTo(url);
            internetServiceImpl.scanDownload(url);
        }
    }

    private static List<String> bannedUrl = Arrays.asList(
        "https://www.pocker.com",
        "https://www.facebook.com",
        "https://www.linkedin.com"
    );
}
