package lesson3_oop;

public class Main {
    public static void main(String[] args) {
        System.out.println("===================Задание3-1========================");
        Phone phone1 = new Phone("985123456", "iPhone 12", 138.4);
        Phone phone2 = new Phone("995123456", "Samsung 11", 140.0);
        Phone phone3 = new Phone("936123456", "Nokia 3310", 78.4);

        System.out.println("Номер телефона: " + phone1.getNumber());
        System.out.println("Модель телефона: " + phone1.getModel());
        System.out.println("Вес: " + phone1.getWeight());
        System.out.println("Номер телефона: " + phone2.getNumber());
        System.out.println("Модель телефона: " + phone2.getModel());
        System.out.println("Вес: " + phone2.getWeight());
        System.out.println("Номер телефона: " + phone3.getNumber());
        System.out.println("Модель телефона: " + phone3.getModel());
        System.out.println("Вес: " + phone3.getWeight());

        phone1.receiveCall("Виктор");
        phone2.receiveCall("Александр");
        phone3.receiveCall("Николай");

        phone1.receiveCall("Алексей", "123456789");

        phone1.sendMessage("123456789", "987654321", "654321987");

        System.out.println("===================Задание3-2========================");
        Matrix mtrx = new Matrix(3,3);
        double[][] inputMatrix = {{1.0,2.0,3.0},{4.0,5.0,6.0},{7.0,8.0,9.0}};
        mtrx.printMatrix();
        System.out.println("Сложение матриц");
        mtrx.addMatrix(inputMatrix);
        mtrx.printMatrix();
        System.out.println("Умножение матрицы на число");
        mtrx.multiplyMatrixOnDigit(5);
        mtrx.printMatrix();
        System.out.println("Умножение матриц");
        mtrx.multiplyMatrix(inputMatrix);
        mtrx.printMatrix();

    }
}
