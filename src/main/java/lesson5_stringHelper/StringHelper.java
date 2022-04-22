package lesson5_stringHelper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHelper {
    private String str;
    private int countWords;
    private String regexp = "[^\\p{L}]+";
    String[] strings;

    public StringHelper(String s) {
        if (s.isEmpty() || s==null || s=="") {
            this.str = s;
            this.strings = null;
            this.countWords = 0;
        } else {
            this.str = s.trim();
            Pattern pattern = Pattern.compile(regexp, Pattern.CASE_INSENSITIVE);
            this.strings = pattern.split(str, -1);
            if (this.strings.length==1 && this.strings[0]==""){
                this.countWords = 0;
            } else {
                this.countWords = strings.length;
            }
        }

    }

    public String getStr() {
        return this.str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getCountWords() {
        return countWords;
    }

    public void getStrings() {
        for (String s : strings) {
            System.out.print(s + "|");
        }
        System.out.println("");
    }

    public int getWordsCount(){
        //String regexp = "[^\\s^\\d^\\.^\\,^\\@^\\*^\\&^\\(^\\)^\\%^\\#]+";
        //String regexp = "^[\\s|\\.|\\,]+";

        //System.out.println(this.str.replaceAll(regexp,"")); проверка работы
        return countWords;
    }

    public String cut(int countSymbols) {
        int sum = 3;
        String resultStr = "";
        if (str.length() >= countSymbols) {
            for (String s : strings) {
                if ((sum + s.length())<=countSymbols){
                    sum +=s.length() + 1;
                    resultStr += s + " ";
                } else {
                    resultStr += "...";
                    break;
                }
            }
            return resultStr;
        } else return this.str;
    }

    public String find(int index, String s){
        Pattern p = Pattern.compile(s, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(str);
        String resultStr=str;
        while (m.find()) {
            int start = m.start();
            int end = m.end();
            if (start>=index) {
                System.out.println("Найдено совпадение " + str.substring(start,end) + " с " + start + " по "+ end);
                resultStr = str.substring(start,str.length());
            }
        }
        return resultStr;
    }

    public String getFirstNumber(){
        Pattern p = Pattern.compile("[\\s|\\.|\\,](\\d)+[\\s|\\.|\\,]");
        Matcher m = p.matcher(str);
        String resultStr="";
        try {
            //if (m.find()) {
                while (m.find()) {
                    int start = m.start()+1;
                    int end = m.end()-1;
                    //System.out.println("Найдено совпадение " + str.substring(start,end) + " с " + start + " по "+ end);
                    resultStr = str.substring(start,end);
                    return resultStr;
                }
            //} else {
                throw new RuntimeException("Исключение: Число в строке не найдено");
            //}
        } catch (RuntimeException e) {
            //System.out.println(e.getMessage());
            resultStr=e.getMessage();
        } finally {
            return resultStr;
        }
    }

    public String getFirstNumber2(){
        Pattern p = Pattern.compile("[\\s|\\.|\\,](\\d)+[\\s|\\.|\\,]");
        Matcher m = p.matcher(str);
        String resultStr="";
            //if (m.find()) {
            while (m.find()) {
                int start = m.start()+1;
                int end = m.end()-1;
                //System.out.println("Найдено совпадение " + str.substring(start,end) + " с " + start + " по "+ end);
                resultStr = str.substring(start,end);
                return resultStr;
            }
            //} else {
            throw new RuntimeException("Исключение: Число в строке не найдено");
            //}
    }
}
