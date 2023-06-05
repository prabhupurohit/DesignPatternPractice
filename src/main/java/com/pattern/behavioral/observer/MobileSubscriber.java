package com.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MobileSubscriber implements Subscriber {

    //We can keep a reference to the Subject here
    //So that we can change the Observer's state based on Subject's State
    //Agency agency

    //Or we can pass the Subject's State to the Observer in the update() method as a parameter
    //So that the Observer can change it's state based on this parameter

    //This is the Observer's state
    private List<String> mobileNews;

    public MobileSubscriber() {
        this.mobileNews = new ArrayList<>();
    }

    @Override
    public void update(List<NewsLetter> newsLetters) {
        newsLetters.stream()
                .filter(news -> news.getStatus().equalsIgnoreCase("new"))
                .forEach(news -> mobileNews.add(news.getNewsMobileVersion()));
    }

    @Override
    public void printNews() {

        System.out.println("Printing Mobile News!");
        mobileNews.forEach(System.out::println);

    }

}
