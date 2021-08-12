package com.kodilla.collections.adv.exercises.dictionary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTestSuite {

    @Test
    public void TestAdvanced() {
        // given
        Dictionary dictionary = new Dictionary();
        String polishWord = "Stos";
        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN, "Stack");
        // when
        dictionary.addWord(polishWord,englishWord);
        // then
        assertEquals(1, dictionary.size());
    }
    @Test
    public void testFindEnglishWords() {
        // given
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("Stos", new EnglishWord(PartOfSpeech.NOUN, "Stack"));
        dictionary.addWord("Gra", new EnglishWord(PartOfSpeech.NOUN, "Play"));
        dictionary.addWord("Gra", new EnglishWord(PartOfSpeech.NOUN, "Game"));
        dictionary.addWord("Grać", new EnglishWord(PartOfSpeech.VERB, "Play"));

        // when
        List<EnglishWord> result = dictionary.findEnglishWords("Gra");
        // then
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "Play"));
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "Game"));
        assertEquals(expectedList, result);
    }
    @Test
    public void testFindEnglishWords_withPartOfSpeech() {
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("Stos", new EnglishWord(PartOfSpeech.NOUN, "Stack"));
        dictionary.addWord("Brać", new EnglishWord(PartOfSpeech.NOUN, "Brotherhood"));
        dictionary.addWord("Brać", new EnglishWord(PartOfSpeech.VERB, "Take"));
        dictionary.addWord("Grać", new EnglishWord(PartOfSpeech.VERB, "Play"));

        List<EnglishWord> result = dictionary.findEnglishWords("Brać", PartOfSpeech.NOUN);

        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "Brotherhood"));
        assertEquals(expectedList, result);

    }
}