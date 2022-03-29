package lesson4_oop_patterns2;

import lesson4_oop_patterns2.com.company.details.Engine;
import lesson4_oop_patterns2.com.company.professions.Driver;
import lesson4_oop_patterns2.com.company.vehicles.Car;
import lesson4_oop_patterns2.com.company.vehicles.Lorry;
import lesson4_oop_patterns2.com.company.vehicles.SportCar;

public class Application {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota Mark II", "Легковая", 2.5,
                new Driver("Иванов", "Иван", "Иванович", 5),
                new Engine(250, "Toyota"));

        Driver driver2 = new Driver("Петров", "Петр", "Петрович", 15);
        SportCar car2 = new SportCar("Aston Martin", 1.8, driver2,
                new Engine(450, "Aston"), 280);

        Engine engine3 = new Engine(500, "Alfa Romeo");
        Car car3 = new SportCar("Bugatti Veiron", 1.2, new Driver("Сидоров", "Сидр", "Сидорович", 25), engine3, 400);

        Car car4 = new Lorry("Man", 10, new Driver("Александров", "Александр", "Александрович", 20),
                new Engine(500, "Камаз"), 30);
        car4.start();
        car3.stop();
        car2.turnLeft();
        car1.turnRight();
        Car[] cars = {car1, car2, car3, car4};

        for (Car car:cars) {
            System.out.println(car);
        }
    }
}
