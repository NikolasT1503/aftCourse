package lesson5_stringHelper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CheckFindDigit {
    private String rightStr = "Привет, пока - 123 до2 *)(&^%$@# свидания";
    private String wrongStr = "Привет, пока -123 до2 *)(&^%$@# свидания";
    private String expectedDigit = "123";
    private String defaultExceptionMessage = "Исключение: Число в строке не найдено";

    @Test
    void checkFindDigit(){
        StringHelper sh = new StringHelper(rightStr);
        assertTrue(expectedDigit.equals(sh.getFirstNumber()),"Ожидалось что найдется число в строке, но не нашлось");
    }

    @Test
    @DisplayName("Test assert RuntimeException")
    void checkNotFindDigit(){
        StringHelper sh1 = new StringHelper(wrongStr);
        RuntimeException e = assertThrows(RuntimeException.class, () -> {
            //throw new RuntimeException("Исключение: Число в строке не найдено");
            sh1.getFirstNumber2();
        });
        assertEquals(defaultExceptionMessage, e.getMessage(), "Ожидалось Runtime Exception, но оно не произошло");
    }

}
