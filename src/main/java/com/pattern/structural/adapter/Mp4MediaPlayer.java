package com.pattern.structural.adapter;

public class Mp4MediaPlayer implements AdvancedMediaPlayer {

    @Override
    public void playAdvanced(AudioType audioType, String filename) {
        if (audioType == AudioType.MP4) {
            System.out.println("Playing MP4 file: " + filename + "...");
        } else {
            System.out.println("Incompatible Media file type!");
        }
    }
}
