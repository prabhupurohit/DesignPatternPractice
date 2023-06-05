package com.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class DesktopSubscriber implements Subscriber {

    //We can keep a reference to the Subject here
    //So that we can change the Observer's state based on Subject's State
    //Agency agency

    //Or we can pass the Subject's State to the Observer in the update() method as a parameter
    //So that the Observer can change it's state based on this parameter

    //This is the Observer's state
    private List<String> desktopNews;

    public DesktopSubscriber() {
        this.desktopNews = new ArrayList<>();
    }

    @Override
    public void update(List<NewsLetter> newsLetters) {
        newsLetters.stream()
                .filter(news -> news.getStatus().equalsIgnoreCase("new"))
                .forEach(news -> desktopNews.add(news.getNewsDesktopVersion()));

    }

    @Override
    public void printNews() {

        System.out.println("Printing Desktop News!");
        desktopNews.forEach(System.out::println);

    }


}
