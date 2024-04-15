package cz.czechitas.lekce11.school;

import java.time.LocalDate;

public class Teacher extends Person {
    private String masterOfClass;

    public Teacher(String masterOfClass) {
        this.masterOfClass = masterOfClass;
    }

    public Teacher(String name, String surname, LocalDate dateOfBirth, String masterOfClass) {
        super(name, surname, dateOfBirth);
        this.masterOfClass = masterOfClass;
    }

    public Teacher() {
    }

    public String getMasterOfClass() {
        return masterOfClass;
    }

    public void setMasterOfClass(String masterOfClass) {
        this.masterOfClass = masterOfClass;
    }

    public boolean isMasterOfClass() {
        return !masterOfClass.isEmpty();

    }

    @Override
    public String toString() {
        if (isMasterOfClass()) {
            return "Teacher " +
                    super.getName() + " " +
                    super.getSurname() +
                    " (masterOfClass: " + masterOfClass +
                    ")";
        } else {
            return "Teacher " +
                    super.getName() + " " +
                    super.getSurname() +
                    ")";
        }
    }
}
