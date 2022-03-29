package lesson4_oop_patterns;

public class Vet {

    public void treatAnimal(Animal a) {
        System.out.println("Животное{" +
                "Класс='" + a.getClassAnimal() + '\'' +
                ", Имя='" + a.getName() + '\'' +
                ", Возраст=" + a.getAge() +
                ", Локация='" + a.getLocation() + '\'' +
                ", Питается=" + a.getFood() +
                '}');
    }
}
