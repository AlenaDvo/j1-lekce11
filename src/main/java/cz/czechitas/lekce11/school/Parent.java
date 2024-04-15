package cz.czechitas.lekce11.school;

import java.time.LocalDate;
import java.util.List;

public class Parent extends Person {

    private List<Student> children;

    public Parent(String name, String surname, LocalDate dateOfBirth, List<Student> children) {
        super(name, surname, dateOfBirth);
        this.children = children;
    }

    public Parent(List<Student> children) {
        this.children = children;
    }

    public Parent() {
    }

    public List<Student> getChildren() {
        return children;
    }

    public void setChildren(List<Student> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Parent " +
                super.getName() + " " +
                super.getSurname() +
                " (children: " + children +
                ")";
    }
}
