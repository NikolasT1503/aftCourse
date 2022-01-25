package lesson2;

import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        System.out.println("======================Задание 2-1==========================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = sc.nextLine();
        System.out.println("Количество пробелов в строке = " + countSpaces(s));
        System.out.println("======================Задание 2-2==========================");
        System.out.print("Введите любое положительное число: ");
        int n = sc.nextInt();
        for (int i=1; i<=n;i++){
            if (isSimpleNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("======================Задание 2-3==========================");

        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<ArrayList<Integer>>();
        int countOfLists = rnd.nextInt(10-1)+1; // рандомное значение количества списков в списке
        //генерация количества списков и заполнение списков
        for (int i =0; i < countOfLists; i++){ // пробегаемся по количеству листов
            ArrayList<Integer> tmpList = new ArrayList<Integer>();
            int countOfElements = rnd.nextInt(10-1)+1;
            for (int j=0; j < countOfElements; j++){
                tmpList.add(rnd.nextInt(100));
            }
            listOfLists.add(tmpList);
        }
        //Вывод списка списков для проверки корректности работы функции
        System.out.print("{");
        listOfLists.forEach(list -> {
            System.out.print("{");
            list.forEach(el -> {
                System.out.print(el + ",");
            });
            System.out.print("}, ");
        });
        System.out.println("}");
        System.out.print("Введите любое положительное число: ");
        int count = sc.nextInt();
        System.out.println(isEqualCountElementsInLists(count, listOfLists));

        System.out.println("======================Задание 2-4==========================");
        int[] ints = new int[rnd.nextInt(20-3)+3]; //минимальное количество элементов в массиве 3
        //заполняем массив случайными числами
        for (int i = 0; i < ints.length; i++){
            ints[i] = rnd.nextInt(9);
            System.out.print(ints[i] + " ");
        }
        System.out.println();
        System.out.print("Введите любое положительное число: ");
        int sum = sc.nextInt();
        System.out.println(isEqualTwoDigitsSumInArray(sum, ints));

        System.out.println("======================Задание 2-5==========================");
        String[] names = {"Иван", "Петр", "Ольга", "Николай", "Евгения", "Наталья", "Роман", "Александр", "Федор", "Константин", "Татьяна", "Алексей", "Григорий", "Настя"};
        Map<String, Double> map = new HashMap<>();
        for (int i = 0; i < (rnd.nextInt(30-10)+10); i++){ //число студентов от 10 до 30
            double avgPoints = 1 + (5-1)* rnd.nextDouble();
            double scale = Math.pow(10, 2);
            avgPoints = roundDouble(avgPoints);
            map.put(names[rnd.nextInt(13)]+String.valueOf(rnd.nextInt(5-1)+1),avgPoints);
        }
        map.entrySet().forEach(m -> {
            System.out.println(m.getKey() + " -> " + m.getValue());
        });
        System.out.println("Студент с наивысшим средним баллом: " + printStudentWithMaxAvgPoint(map));

        System.out.println("======================Задание 2-6==========================");
        String ss = sc.nextLine();
        System.out.print("Введите строку: ");
        ss = sc.nextLine();
        System.out.println("Количество слов в строке = " + countWords(ss, ' '));

        System.out.println("======================Задание 2-7==========================");
        ArrayList<ArrayList<Integer>> listOfPoints = new ArrayList<ArrayList<Integer>>();
        int countOfLists2 = rnd.nextInt(20-1)+1; // рандомное значение количества списков в списке
        //генерация количества списков и заполнение списков
        for (int i =0; i < countOfLists2; i++){ // пробегаемся по количеству листов
            ArrayList<Integer> tmpList = new ArrayList<Integer>();
            int countOfElements = rnd.nextInt(10-1)+1;
            for (int j=0; j < countOfElements; j++){
                tmpList.add(rnd.nextInt(6-1)+1);
            }
            listOfPoints.add(tmpList);
        }
        //Вывод списка списков для проверки корректности работы функции
        System.out.print("{");
        listOfPoints.forEach(list -> {
            System.out.print("{");
            list.forEach(el -> {
                System.out.print(el + ",");
            });
            System.out.print("} ");
        });
        System.out.println("}");
        Map<String,Double> students = new HashMap<>(countAvgPoint(listOfPoints));
        students.keySet().forEach(student -> {
            System.out.println(student + " = " + students.get(student));
        });
    }

    public static int countSpaces(String s) {
        int count = 0;
        for (int i=0; i < s.length(); i++){
            if (s.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }

    public static int countWords(String s, char delimeter) {
        Map<Integer,String> map = new HashMap<>();
        String tmpStr = "";
        int indexOfWord = 0;
        for (int i=0; i < s.length(); i++){
            if (i == s.length()-1) {
                map.put(indexOfWord, tmpStr);
            } else {
                if ((s.charAt(i) == delimeter) & (tmpStr!="")){
                    map.put(indexOfWord, tmpStr);
                    tmpStr = "";
                    indexOfWord++;
                } else {
                    if (s.charAt(i) != delimeter) {
                        tmpStr += s.charAt(i);
                    }
                }
            }

        }
        return map.keySet().size();
    }

    protected static double roundDouble(double d){
        double scale = Math.pow(10, 2);
        double result = Math.ceil(d * scale) / scale;
        return result;
    }

    public static boolean isSimpleNumber(int n) {
        if (n < 2) {
            return false;
        }
        double s = Math.sqrt(n);
        for (int i = 2; i <= s; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEqualCountElementsInLists (int n, ArrayList<ArrayList<Integer>> lists){
        boolean result = false;
        ArrayList<Integer> digits = new ArrayList<Integer>();
        while (n != 0) {
            digits.add(0,n % 10);
            n /= 10;
        }
        for (int i = 0; i < digits.size(); i++){
            if (digits.get(i) == lists.get(i).size()) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean isEqualTwoDigitsSumInArray (int n, int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (n == arr[i]+arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String printStudentWithMaxAvgPoint(Map<String, Double> map){
        String result = "";
        if (!map.isEmpty()) {
            String[] tmpKeys = map.keySet().toArray(new String[0]);
            double maxAvgPoint = map.get(tmpKeys[0]);
            for (String s : map.keySet()) {
                if (maxAvgPoint < map.get(s)) {
                    maxAvgPoint = map.get(s);
                    result = s + " -> " + maxAvgPoint;
                }
            }
        } else {
            return "Карта пустая";
        }
        return result;
    }

    public static Map<String,Double> countAvgPoint(ArrayList<ArrayList<Integer>> arr){
        Map<String,Double> resultMap = new HashMap<>();
        double tmpSum = 0;
        double tmpCount = 0;
        double tmpAvg = 0;
        for (int i = 0; i < arr.size(); i++){
            for (int j = 0; j < arr.get(i).size(); j++){
                tmpSum += arr.get(i).get(j);
                tmpCount += 1;
            }
            tmpAvg = roundDouble(tmpSum / tmpCount);
            resultMap.put("Студент №"+(i+1), tmpAvg);
        }
        return resultMap;
    }
}
