package lesson4_oop_patterns;

public class Horse extends Animal{
    private String horseBreed;

    public Horse(String food, String location, String name, int age, String horseBreed) {
        super(food, location, name, age, "Лошадь");
        this.horseBreed = horseBreed;
    }

    public String getHorseBreed() {
        return horseBreed;
    }

    public void setHorseBreed(String horseBreed) {
        this.horseBreed = horseBreed;
    }


    @Override
    public void makeNoise(){
        System.out.println(this.getClassAnimal() +" " + this.getName() + " игогокает");
    }

    @Override
    public void eat() {
        System.out.println(this.getClassAnimal() + " " + this.getName() + " кушает");
    }

    @Override
    public void sleep() {
        System.out.println(this.getClassAnimal() + " " + this.getName() + " спит");
    }

    @Override
    public String toString() {
        return "Животное{" +
                "Класс='" + this.getClassAnimal() + '\'' +
                ", Имя='" + this.getName() + '\'' +
                ", Возраст=" + this.getAge() +
                ", Локация='" + this.getLocation() + '\'' +
                ", Питается=" + this.getFood() +
                ", Порода=" + this.getHorseBreed() +
                '}';
    }
}
