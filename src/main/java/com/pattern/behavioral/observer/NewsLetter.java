package com.pattern.behavioral.observer;

import java.util.Random;

public class NewsLetter {

    private int id;
    private String newsMobileVersion;
    private String newsDesktopVersion;
    private String status;

    public NewsLetter() {
        this.status = "new";
        Random random = new Random();
        id = random.nextInt(1000);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNewsMobileVersion() {
        return newsMobileVersion;
    }

    public void setNewsMobileVersion(String newsMobileVersion) {
        this.newsMobileVersion = newsMobileVersion;
    }

    public String getNewsDesktopVersion() {
        return newsDesktopVersion;
    }

    public void setNewsDesktopVersion(String newsDesktopVersion) {
        this.newsDesktopVersion = newsDesktopVersion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
