package practice_23.sentence_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceTest {

    //поле класса
    Sentence sentence; //определяем поле с типом в тестируемого класса Sentence и создаем объект sentence такого типа


    @BeforeEach
    void setUp() {

        sentence = new Sentence(""); //создали объект sentence класса Sentence
    }

    @Test
    void wordsInSentenceTest() {
       // String st = "привет и пока-пока!";
        int n = sentence.wordsInSentence("привет и пока-пока!");
        Assertions.assertEquals(3, n); //

    }

    @Test
    void lettersInSentenceTest() {
        String st ="Я к вам пишу, чего же боле...";
        assertEquals(19, sentence.lettersInSentence(st));


    }
}