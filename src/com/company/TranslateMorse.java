package com.company;

public class TranslateMorse {


    String[] EngArray = new String[]{"errorE","A","B","C","D","E","F","G","H","I","J","K", "L","M","N","O","P","Q","R","S","T","U", "V","W","X","Y","Z","1","2","3","4","5","6","7","8","9","0",".",",","?"};
    String[] MorseArray = new String[]{"errorM",".-", "-...","-.-.", "-..", ".", "..-.", "--.","....", "..", ".---", "-.-", ".-..", "--", "-.","---", ".--.", "--.-", ".-.", "...", "-", "..-",
            "...-", ".--", "-..-", "-.--", "--..",
            ".----", "..---", "...--", "....-",
            ".....", "-....", "--...", "---..", "----.",
            "-----",".-.-.-","--..--","..--.."};

    public String engToMorse(String str) {

        int index = 0;
        for (int j = 0; j < EngArray.length; j++) {
            if (EngArray[j] == str ) {
                index = j;
            }
        }
        return MorseArray[index];
    }

    public String morseToEng(String morse) {
        int index = 0;
        for (int j = 0; j < MorseArray.length; j++) {
            if (MorseArray[j] == morse ) {
                index = j;
            }
        }

        return EngArray[index];
    }
}