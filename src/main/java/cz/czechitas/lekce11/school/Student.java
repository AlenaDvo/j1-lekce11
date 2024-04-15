package cz.czechitas.lekce11.school;

import java.time.LocalDate;
import java.util.List;

public class Student extends Person {
    private SchoolClass schoolClass;
    private List<Integer> grades;

    public Student(String name, String surname, LocalDate dateOfBirth, SchoolClass schoolClass, List<Integer> grades) {
        super(name, surname, dateOfBirth);
        this.schoolClass = schoolClass;
        this.grades = grades;
    }

    public Student(SchoolClass schoolClass, List<Integer> grades) {
        this.schoolClass = schoolClass;
        this.grades = grades;
    }

    public Student() {
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
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
                " (class " + schoolClass +
                ")";
    }

    @Override
    public String toString() {
        return "Student " +
                super.getName() + " " +
                super.getSurname() +
                " (date of birth: " + super.getDateOfBirth() +
                ", class: " + schoolClass +
                ", grades: " + grades +
                ")";
    }
}
