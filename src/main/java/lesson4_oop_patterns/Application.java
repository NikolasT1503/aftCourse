package lesson4_oop_patterns;

public class Application {
    public static void main(String[] args) {
        Animal animal1 = new Dog("мясо", "Москва", "Обама", 1, "Лабрадор");
        Animal animal2 = new Cat("рыба", "Питер", "Псаки", 3, "Египетска");
        Animal animal3 = new Horse("трава", "Калуга", "Байден", 2, "Орловская");
        Vet vet = new Vet();
        animal1.sleep();
        animal2.eat();
        animal3.makeNoise();
        System.out.println(animal1);
        Animal[] animalArray = {animal1, animal2, animal3};
        for (int i=0; i<animalArray.length; i++) {
            vet.treatAnimal(animalArray[i]);
        }

    }
}
