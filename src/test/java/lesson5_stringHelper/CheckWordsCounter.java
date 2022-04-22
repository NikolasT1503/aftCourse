package lesson5_stringHelper;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckWordsCounter extends StringHelperTests {
    private StringHelper sh, sh1;
    private String defaultStrWithSimbolsAndDigits = "Проверка количества 123 +-24? слов1 в23 строке";
    private String defaultBigStrWithSimbolsAndDigits = "asasdadasd1231 +&^54* sdfsdfsdf 123234 sdfsdfsdfsdfsdf wer4534dsad 567567sf-= xvxcvxcvxcvxcvxvxvdgdfgddgqwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwqwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww";
    private int defaultCountWords = 5;
    private int defaultCountWordsInBigStr = 7;

    @BeforeEach
    void localSetup(){
        System.out.println("local setup");
        sh = new StringHelper(defaultStrWithSimbolsAndDigits);
        System.out.println("Создан экземпляр класса StringHelper со строкой");
        sh1 = new StringHelper(defaultBigStrWithSimbolsAndDigits);
        System.out.println("Создан второй экземпляр класса со строкой > 255 символов");
    }

    @AfterEach
    void localTeardown(){
        System.out.println("local teardown");
    }

    @Test
    void checkCountOfWords() {
        assertEquals(defaultCountWords, sh.getWordsCount(),"Не совпадает количество слов");
    }

    @Test
    void checkCountOfWordsInBigStr(){
        assertEquals(defaultCountWordsInBigStr, sh1.getWordsCount(),"Не совпадает количество слов в строке > 255");
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void checkCountWords(String s){
        StringHelper sh2 = new StringHelper(s);
        assertEquals(defaultCountWords,sh2.getCountWords(),"Не совпадает количество слов");
    }

    static Stream<String> stringProvider(){
        return Stream.of(
                "Проверка количества 123 +-24? слов1 в23 строке",
                "asasdadasd1231 +&^54* 123234 sdfsdfsdfsdfsdf wer4534dsad-= xvxcvxcvxcvxcvxvxvdgdfgddgqwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwqwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww"
        );
    }

}
