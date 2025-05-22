package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        redRemote.turnOn();
        blackRemote.turnOn();

        redRemote.turnOff();
        blackRemote.turnOff();

        redRemote.channelUp();
        blackRemote.channelDown();

        while (redRemote.channel > 0) {
            redRemote.channelDown();
        }

        redRemote.volumeDown();
        blackRemote.volumeUp();


        while (redRemote.volume > 0) {
            redRemote.volumeDown();
        }


    }
    }

