package com.pattern.structural.adapter;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advMediaPlayer;

    public MediaAdapter(AdvancedMediaPlayer advMediaPlayer) {
        this.advMediaPlayer = advMediaPlayer;
    }

    @Override
    public void play(AudioType audioType, String filename) {
        advMediaPlayer.playAdvanced(audioType, filename);
    }
}
