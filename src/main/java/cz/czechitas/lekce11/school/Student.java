package cz.czechitas.lekce11.school;

import java.time.LocalDate;
import java.util.List;

public class Student extends Person {
    private String clas;
    private List<Integer> grades;

    public Student(String name, String surname, LocalDate dateOfBirth, String clas, List<Integer> grades) {
        super(name, surname, dateOfBirth);
        this.clas = clas;
        this.grades = grades;
    }

    public Student(String clas, List<Integer> grades) {
        this.clas = clas;
        this.grades = grades;
    }

    public Student() {
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public String getDisplayName() {
        return super.getName() + " " +
                super.getSurname() +
                " (class " + clas +
                ")";
    }

    @Override
    public String toString() {
        return "Student " +
                super.getName() + " " +
                super.getSurname() +
                " (date of birth: " + super.getDateOfBirth() +
                ", class: " + clas +
                ", grades: " + grades +
                ")";
    }
}
