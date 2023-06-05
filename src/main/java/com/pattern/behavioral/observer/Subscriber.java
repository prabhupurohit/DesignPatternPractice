package com.pattern.behavioral.observer;

import java.util.List;

//This is an interface for the Observer which has one method
//Update() to update itself in case of a new notification
public interface Subscriber {
    public void update(List<NewsLetter> newsLetters);
    public void printNews();
}
