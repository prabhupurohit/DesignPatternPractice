package com.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

//This is the Concrete Subject
public class MediaAgency implements Agency {

    private List<NewsLetter> newsLetters;

    private List<Subscriber> subscribers;

    public MediaAgency() {
        this.newsLetters = new ArrayList<>();
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifyAllSubscriber() {
        try {
            for (Subscriber subscriber : subscribers) {
                subscriber.update(newsLetters);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        newsLetters.forEach(newsLetter -> newsLetter.setStatus("old"));
    }

    public List<NewsLetter> getNewsLetters() {
        return newsLetters;
    }

    public void addNewsLetter(NewsLetter newsLetter) {
        newsLetters.add(newsLetter);
        //Whenever a newsletter is added, notify all the subscribers
        notifyAllSubscriber();
    }
}
