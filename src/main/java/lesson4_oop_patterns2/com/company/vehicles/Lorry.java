package lesson4_oop_patterns2.com.company.vehicles;

import lesson4_oop_patterns2.com.company.details.Engine;
import lesson4_oop_patterns2.com.company.professions.Driver;

public class Lorry extends Car{
    private double loadCapacity;

    public Lorry(String brand, double weight, Driver driver, Engine engine, double loadCapacity) {
        super(brand,"Грузовик",weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }
    @Override
    public String toString() {
        return "Автомобиль{" +
                "Марка='" + this.getBrand() + '\'' +
                ", Класс='" + this.getClassAuto() + '\'' +
                ", Вес='" + this.getWeight() + '\'' +
                ", Двигатель=" + this.getEngine() +
                ", Водитель='" + this.getDriver() +
                ", Грузоподъемность='" + this.getLoadCapacity() +
                '}';
    }
}
