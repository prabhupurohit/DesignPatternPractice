package com.pattern.behavioral.observer;

import java.nio.channels.NonWritableChannelException;

public class ObserverDemo {

    public static void main(String[] args) {

        //Create a Media Agency first
        Agency agency = new MediaAgency();

        //Create a Mobile subscriber
        Subscriber mobileSubscriber = new MobileSubscriber();

        //Create a Desktop subscriber
        Subscriber desktopSubscriber = new DesktopSubscriber();

        //Add some subscribers to this
        agency.addSubscriber(mobileSubscriber);
        agency.addSubscriber(desktopSubscriber);

        //Now create a News Letter
        NewsLetter newsLetter1 = new NewsLetter();
        newsLetter1.setNewsMobileVersion("Today there was an Accident!");
        newsLetter1.setNewsDesktopVersion("Today there was an Accident!Today there was an Accident!Today there was an Accident!");

        agency.addNewsLetter(newsLetter1);

        mobileSubscriber.printNews();
        desktopSubscriber.printNews();

        //Now create a News Letter
        NewsLetter newsLetter2 = new NewsLetter();
        newsLetter2.setNewsMobileVersion("Tomorrow there is State election!");
        newsLetter2.setNewsDesktopVersion("Tomorrow there is State election!Tomorrow there is State election!Tomorrow there is State election!");

        agency.addNewsLetter(newsLetter2);

        mobileSubscriber.printNews();
        desktopSubscriber.printNews();

    }

}
