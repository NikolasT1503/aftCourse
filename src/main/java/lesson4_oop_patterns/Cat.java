package lesson4_oop_patterns;

public class Cat extends Animal{
    private String catBreed;

    public Cat(String food, String location, String name, int age, String catBreed) {
        super(food, location, name, age, "Кошка");
        this.catBreed = catBreed;
    }

    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }


    @Override
    public void makeNoise(){
        System.out.println(this.getClassAnimal() +" " + this.getName() + " мяукает");
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
                ", Порода=" + this.getCatBreed() +
                '}';
    }
}
