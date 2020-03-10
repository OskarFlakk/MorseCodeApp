package com.company;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class TranslateMorse {

    int arrayIndex;
    String[] EngArray = new String[]{"errorE","A", "B"};
    String[] MorseArray = new String[]{"errorM",".-", "-..."};

    public String engToMorse(String str) {


        for (int j = 0; j < EngArray.length; j++) {
            if (EngArray[j] ==str ) {
                arrayIndex = j;
            }
        }

        return MorseArray[arrayIndex];
    }

    public String morseToEng(String morse) {

        for (int j = 0; j < MorseArray.length; j++) {
            if (MorseArray[j] ==morse ) {
                arrayIndex = j;
            }
        }

        return EngArray[arrayIndex];
    }
}