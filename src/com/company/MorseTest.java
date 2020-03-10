package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MorseTest {

    TranslateMorse translator = new TranslateMorse();

    @Test
    public void testEngAtoMorseA() {

        assertEquals(".-",translator.engToMorse("A"));
    }

    @Test
    public void testEngAtoMorseB() {

        assertEquals("-...",translator.engToMorse("B"));
    }

    @Test
    public void testMorsetoEngA() {

        assertEquals("A",translator.morseToEng(".-"));
    }

    @Test
    public void testMorsetoEngB() {
        TranslateMorse translator = new TranslateMorse();
        assertEquals("B",translator.morseToEng("-..."));
    }

    @Test
    public void testEngAtoMorseInvalidcharsError() {
        TranslateMorse translator = new TranslateMorse();
        assertEquals("error, invalid character",translator.engToMorse("Ö"));
    }

    @Test
    public void testMorsetoEngInvalidcharsError() {
        TranslateMorse translator = new TranslateMorse();
        assertEquals("error, invalid character",translator.morseToEng("Å"));
    }
}