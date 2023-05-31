package com.pattern.structural.adapter;

public class AdapterDemo {

    public static void main(String[] args) {

        VlcMediaPlayer vlcMediaPlayer = new VlcMediaPlayer();
        Mp4MediaPlayer mp4MediaPlayer = new Mp4MediaPlayer();

        //Old Media Player which can run only MP3 files
        MediaPlayer mediaPlayer = new AudioPlayer();
        mediaPlayer.play(AudioType.MP3, "/media/mp3_files/new_song.mp3");

        //Hook an Adapter which can play MP4 files
        MediaAdapter mp4Adapter = new MediaAdapter(mp4MediaPlayer);
        MediaPlayer mediaPlayer1 = new AudioPlayer(mp4Adapter);
        mediaPlayer1.play(AudioType.MP4, "/media/mp3_files/new_song.mp4");

        //Hook an Adapter which can play VLC files
        MediaAdapter vlcAdapter = new MediaAdapter(vlcMediaPlayer);
        MediaPlayer mediaPlayer2 = new AudioPlayer(vlcAdapter);
        mediaPlayer2.play(AudioType.VLC, "/media/mp3_files/new_song.vlc");

    }
}
