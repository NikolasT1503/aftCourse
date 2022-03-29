package lesson4_oop_patterns2.com.company.vehicles;

import lesson4_oop_patterns2.com.company.details.Engine;
import lesson4_oop_patterns2.com.company.professions.Driver;

public class SportCar extends Car{
    private int maxSpeed;

    public SportCar(String brand, double weight, Driver driver, Engine engine, int maxSpeed) {
        super(brand, "Спорткар", weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Автомобиль{" +
                "Марка='" + this.getBrand() + '\'' +
                ", Класс='" + this.getClassAuto() + '\'' +
                ", Вес='" + this.getWeight() + '\'' +
                ", Двигатель=" + this.getEngine() +
                ", Водитель='" + this.getDriver() +
                ", Макс. скорость='" + this.getMaxSpeed() +
                '}';
    }
}
