/*
You are developing a media player application that supports different types of media files, such as audio and video.
The application should provide the functionality to play,pause, and stop media files.
Requirements: 
Create an interface called MediaPlayer with the following methods:
void play(): Prints "Playing media file."
void pause(): Prints "Pausing media file."
void stop(): Prints "Stopping media file."
Create two classes, AudioPlayer and VideoPlayer, that implement the MediaPlayer interface.
The AudioPlayer class should override the interface methods and provide the following additional methods:
void setVolume(int volume): Prints the volume level.
void setEqualizer(String equalizer): Prints the equalizer settings. The VideoPlayer class should
override the interface methods and provide the following
additional methods:
void setBrightness(int brightness): Prints the brightness level.
void setSubtitleLanguage(String language): Prints the subtitle language.

University - Green University of Bangladesh
IDE - Apache NetBeans 18
Date - July 5, 23
*/

package com.question_5_mainclass;

interface MediaPlayer {
    void play();
    void pause();
    void stop();
}
class AudioPlayer implements MediaPlayer {
    public void play() {
        System.out.println("Playing Media File");
    }
    public void pause() {
        System.out.println("Pausing Media File");
    }
    public void stop() {
        System.out.println("Stoping Media File");
    }
     void setVolume(int volume) {
        System.out.println("The Volume Setting is : " + volume);
    }
     void setEqualizer(String equalizer) {
        System.out.println("The Equalizer Setting is : " + equalizer);
    }
}
class VideoPlayer implements MediaPlayer {    
    public void play() {
        System.out.println("Playing Video File");
    }
    public void pause() {
        System.out.println("Pausing Video File");
    }
    public void stop() {
        System.out.println("Stopping Video File");
    }
    void setBrightness(int brightness) {
        System.out.println("The Brightness Setting is : " + brightness);
    }
    void setSubtitleLanguage(String language) {
        System.out.println("The language Setting is : " + language);
    }
}
public class Question_5_mainClass {
    public static void main(String[] args) {
        AudioPlayer ob_1 = new AudioPlayer();
        VideoPlayer ob_2 = new VideoPlayer();       
        ob_1.play();
        ob_1.pause();
        ob_1.stop();
        ob_1.setVolume(80);
        ob_1.setEqualizer("Classic");       
        System.out.println("");        
        ob_2.play();
        ob_2.pause();
        ob_2.stop();
        ob_2.setBrightness(60);
        ob_2.setSubtitleLanguage("English");
    }
}
