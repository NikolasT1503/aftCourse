package lesson4_oop_patterns2.com.company.professions;

public class Person {
    private String fam;
    private String im;
    private String ot;
    private String fullName;

    public Person(String fam, String im, String ot) {
        this.fam = fam;
        this.im = im;
        this.ot = ot;
        this.fullName = fam + " " + im + " " + ot;
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public String getOt() {
        return ot;
    }

    public void setOt(String ot) {
        this.ot = ot;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "ФИО=" + this.getFullName();
    }
}
