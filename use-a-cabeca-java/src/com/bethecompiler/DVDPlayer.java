package com.bethecompiler;

public class DVDPlayer {

    boolean canRecord = false;

    void playDVD(){
        System.out.println("DVD playing");
    }

    void recordDVD() {
        System.out.println("DVD recording");
    }
}

class DVDPlayerTestDrive {
    public static void main(String[] args) {

        DVDPlayer d = new DVDPlayer();

        d.canRecord = true;
        d.playDVD();

        if (d.canRecord) {
            d.recordDVD();
        }
    }
}