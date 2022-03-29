package lesson4_oop_patterns2.com.company.professions;

public class Driver extends Person {
    private int workExperience;

    public Driver(String fam, String im, String ot, int workExperience) {
        super(fam, im, ot);
        this.workExperience = workExperience;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public String toString() {
        return "Водитель{" +
                "ФИО='" + this.getFullName() + '\'' +
                ", Стаж='" + this.getWorkExperience() +
                '}';
    }


}
