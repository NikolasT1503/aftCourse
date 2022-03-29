package lesson4_oop_patterns2.com.company.vehicles;

import lesson4_oop_patterns2.com.company.details.Engine;
import lesson4_oop_patterns2.com.company.professions.Driver;

public class Car {
    private String brand;
    private String classAuto;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car(String brand, String classAuto, double weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.classAuto = classAuto;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getClassAuto() {
        return classAuto;
    }

    public void setClassAuto(String classAuto) {
        this.classAuto = classAuto;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnRight(){
        System.out.println("Поворт направо");
    }

    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Автомобиль{" +
                "Марка='" + this.getBrand() + '\'' +
                ", Класс='" + this.getClassAuto() + '\'' +
                ", Вес='" + this.getWeight() + '\'' +
                ", Двигатель=" + this.getEngine() +
                ", Водитель='" + this.getDriver() +
                '}';
    }
}
