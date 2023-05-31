package com.pattern.structural.adapter;

public class VlcMediaPlayer implements AdvancedMediaPlayer {

    @Override
    public void playAdvanced(AudioType audioType, String filename) {
        if (audioType == AudioType.VLC) {
            System.out.println("Playing VLC file: " + filename + "...");
        } else {
            System.out.println("Incompatible Media file type!");
        }
    }
}
