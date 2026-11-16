package com.fridgesmagnets;


class DrumKit {

    boolean topHat = true;
    boolean snare = true;

    void playSnare(){
        System.out.println("bang bang ba-bang");
    }

    void playTopHat() {
        System.out.println("ding ding da-ding");
    }
}

class DrumKitTestDrive {

    public static void main(String[] args) {

        DrumKit d = new DrumKit();

        if (d.snare) {
            d.playSnare();
        }

        d.playTopHat();
    }
}



