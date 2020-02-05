package org.example;

/*import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;



public class AppTest {

    Anagram stringAnagram = new Anagram();



    @Test

    public void checkThatRatAndArtAreAnagrams() {

        Assertions.assertTrue(stringAnagram.checkAnagram("rat", "art"));

    }

    @Test

    public void checkThatMaryAndArmyAreAnagrams() {

        Assertions.assertTrue(stringAnagram.checkAnagram("listen", "silent"));

    }

    @Test

    public void checkThatOneStringIsConvertedToLowerCase() {

        Assertions.assertTrue(stringAnagram.checkAnagram("listen", "Silent"));

    }

    @Test

    public void checkThatBothStringsAreConvertedToLowerCase() {

        Assertions.assertTrue(stringAnagram.checkAnagram("Listen", "Silent"));

    }

    @Test

    public void checkSingleCharacterStringsWork() {

        Assertions.assertTrue(stringAnagram.checkAnagram("c", "c"));

    }

    @Test

    public void checkEmptyStringsWork() {

        Assertions.assertTrue(stringAnagram.checkAnagram("", ""));

    }

    @Test

    public void checkEmptyStringsReturnTrue() {

        Assertions.assertTrue(stringAnagram.checkAnagram("", ""));

    }

    @Test

    public void checkThatHelloAndHiAreNotAnagrams() {

        Assertions.assertFalse(stringAnagram.checkAnagram("Hello", "Hi"));

    }

    @Test

    public void testThatSpacesAreIgnored() {

        Assertions.assertTrue(stringAnagram.checkAnagram("The eyes", "They see"));

    }

    @Test

    public void testThatSpacesAreIgnoredInOneWord() {

        Assertions.assertTrue(stringAnagram.checkAnagram("Astronomer", "Moon starer"));

    }

}