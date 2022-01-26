package lesson3_oop;

import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weigth){
        this(number, model);
        this.weight = weigth;
    }
    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(){
        this.number = "123456789";
        this.model = "iPhone XXX";
        this.weight = 100.0;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void receiveCall(String nameAbonent){
        System.out.println("Звонит " + nameAbonent);
    }

    public void receiveCall(String nameAbonent, String numberAbonent){
        System.out.println("Звонит " + nameAbonent + " с номера " + numberAbonent);
    }

    public void sendMessage(String... phones){
        System.out.println("Отправка сообщений на следующие номера: " + Arrays.asList(phones));
    }


}
