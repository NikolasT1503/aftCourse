package lesson4_oop_patterns;

public class Dog extends Animal{
    private String dogBreed;


    public Dog(String food, String location, String name, int age, String dogBreed) {
        super(food, location, name, age, "Собака");
        this.dogBreed = dogBreed;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    @Override
    public void makeNoise(){
        System.out.println(this.getClassAnimal() +" " + this.getName() + " лает");
    }

    @Override
    public void eat() {
        System.out.println(this.getClassAnimal() + " " + this.getName() + " кушает");
    }

    @Override
    public String toString() {
        return "Животное{" +
                "Класс='" + this.getClassAnimal() + '\'' +
                ", Имя='" + this.getName() + '\'' +
                ", Возраст=" + this.getAge() +
                ", Локация='" + this.getLocation() + '\'' +
                ", Питается=" + this.getFood() +
                ", Порода=" + this.getDogBreed() +
                '}';
    }
}
