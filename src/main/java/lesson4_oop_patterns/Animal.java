package lesson4_oop_patterns;

public abstract class Animal {
    private String food;
    private String location;
    private String name;
    private int age;
    private String classAnimal;

    public Animal(String food, String location, String name, int age, String classAnimal) {
        this.food = food;
        this.location = location;
        this.name = name;
        this.age = age;
        this.classAnimal = classAnimal;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassAnimal() {
        return classAnimal;
    }

    public void makeNoise(){
        System.out.println("Животное " + this.name + " шумит");
    };

    public abstract void eat();

    public void sleep(){
        System.out.println(this.classAnimal + " " + this.name + " спит");
    };

}
