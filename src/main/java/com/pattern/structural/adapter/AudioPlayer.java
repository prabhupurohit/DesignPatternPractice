package com.pattern.structural.adapter;

//Default Media Player can play only MP3 files
public class AudioPlayer implements MediaPlayer {

    //Add an adapter which can play other type of files such as MP4 and VLC
    MediaAdapter adapter;

    public AudioPlayer() {
    }

    public AudioPlayer(MediaAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void play(AudioType audioType, String filename) {
        if (audioType == AudioType.MP3) {
            System.out.println("Playing MP3 file: " + filename + "...");
        } else if (audioType == AudioType.MP4 || audioType == AudioType.VLC) {
            adapter.play(audioType, filename);
        } else {
            System.out.println("Incorrect Media File type");
        }
    }

}
