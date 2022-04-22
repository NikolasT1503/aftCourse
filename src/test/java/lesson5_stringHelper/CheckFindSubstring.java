package lesson5_stringHelper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckFindSubstring {
    private StringHelper sh;
    private String defaultStr = "Привет, пока - 123 до2 *)(&^%$@# свидания";
    private int defaultRightIndex = 1;
    private int defaultWrongIndex = 9;
    private String defaultSubstring = "пока";
    private String resultRightStr = "пока - 123 до2 *)(&^%$@# свидания";

    @BeforeEach
    void localSetup(){
        sh = new StringHelper(defaultStr);
    }

    @Test
    void rightCheckFindSubStr(){
        String tmpStr = sh.find(defaultRightIndex,defaultSubstring);
        assertTrue(tmpStr.length() == resultRightStr.length(), "Ожидалось, что строки совпадут, но они не совпали");
    }

    @Test
    void wrongCheckFindSubStr(){
        String tmpStr = sh.find(defaultWrongIndex,defaultSubstring);
        assertFalse(tmpStr.length() == resultRightStr.length(),"Ожидалось, что строки не совпадут, но они совпали");
    }

    @Test
    void wrongIndexRightCheckFindSubStr(){
        String tmpStr = sh.find(defaultWrongIndex,defaultSubstring);
        assertTrue(tmpStr.length() == defaultStr.length(), "Ожидалось, что строки совпадут, но они не совпали");
    }

}
