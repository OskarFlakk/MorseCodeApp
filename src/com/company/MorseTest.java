package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MorseTest {

    TranslateMorse translator = new TranslateMorse();

    @Test
    public void testEngAtoMorseA() {

        assertEquals(".-",translator.engToMorse("A"));
    }

    @Test
    public void testEngAtoMorseQmark() {

        assertEquals("..--..",translator.engToMorse("?"));
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

        assertEquals("B",translator.morseToEng("-..."));
    }

    @Test
    public void testEngAtoMorseInvalidcharsError() {

        assertEquals("errorM",translator.engToMorse("Ö"));
    }

    @Test
    public void testMorsetoEngInvalidcharsError() {

        assertEquals("errorE",translator.morseToEng("25"));
    }
}