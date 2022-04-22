package lesson5_stringHelper;

public class Application {
    public static void main(String[] args) {
        String s = "Привет, пока - 123 до2 *)(&^%$@# свидания";
        String defaultBigStrWithSimbolsAndDigits = "asasdadasd1231 +&^54* sdfsdfsdf 123234 sdfsdfsdfsdfsdf wer4534dsad 567567sf-= xvxcvxcvxcvxcvxvxvdgdfgddgqwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwqwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww";

        StringHelper sh = new StringHelper(s);
        System.out.println("Разбивка исходной строки: ");
        sh.getStrings();
        int countSymbols=100;
        System.out.println("Количество слов в строке без учета спецсимволов: " + sh.getWordsCount());
        System.out.println("Обрезка строки до " + countSymbols + " символов: " + sh.cut(countSymbols));
        System.out.println("Поиск подстроки в строке с определенного индекса: " + sh.find(1,"пока"));
        System.out.println("Поиск подстроки в строке с определенного индекса: " + sh.find(9,"пока"));
        String s1 = "Привет, пока -123 до2 *)(&^%$@# свидания";
        StringHelper sh1 = new StringHelper(s1);
        System.out.println("Поиск числа в строке отделенных пробелом или знаками препинания");
        System.out.println("Найденное число: " + sh.getFirstNumber2());
        System.out.println("Найденное число: " + sh1.getFirstNumber2());

        StringHelper sh2 = new StringHelper(defaultBigStrWithSimbolsAndDigits);
        System.out.println("Обрезка строки до " + countSymbols + " символов: " + sh2.cut(countSymbols));
        System.out.println("Поиск подстроки в строке с определенного индекса: " + sh2.find(30,"567567sf"));
    }
}
