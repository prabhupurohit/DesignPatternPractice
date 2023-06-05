package com.pattern.behavioral.observer;

import java.util.List;

//This is the Subject Interface which has basic operations such as
//Add a subscriber (observer)
//Remove a subscriber (Observer)
//Notify all subscribers (Observer)
public interface Agency {
    public void addSubscriber(Subscriber subscriber);
    public void removeSubscriber(Subscriber subscriber);
    public void notifyAllSubscriber();
    public void addNewsLetter(NewsLetter newsLetter);

}
