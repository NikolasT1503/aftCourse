package lesson5_stringHelper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckStringCut extends StringHelperTests{
    private StringHelper sh;
    private String defaultBigStrWithSimbolsAndDigits = "asasdadasd1231 +&^54* sdfsdfsdf 123234 sdfsdfsdfsdfsdf wer4534dsad 567567sf-= xvxcvxcvxcvxcvxvxvdgdfgddgqwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwqwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww";
    private String defaultEtalonStr = "asasdadasd sdfsdfsdf sdfsdfsdfsdfsdf wer dsad sf ...";
    private int defaultCountSymbols = 100;
    private int defaultLength = 52;


    @BeforeEach
    void localSetup(){
        sh = new StringHelper(defaultBigStrWithSimbolsAndDigits);
    }

    @Test
    void checkCutStr(){
        assertTrue(defaultEtalonStr.equalsIgnoreCase(sh.cut(defaultCountSymbols)),"Не совпадает результат обрезки строки до " + defaultCountSymbols + " символов");
    }

    @Test
    void checkLengthCuttingStr(){
        assertTrue(sh.cut(defaultCountSymbols).length() == defaultLength, "Не совпадает длина обрезанной строки");
    }
}
