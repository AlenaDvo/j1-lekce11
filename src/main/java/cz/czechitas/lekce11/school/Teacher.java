package cz.czechitas.lekce11.school;

import java.time.LocalDate;

public class Teacher extends Person {
    private SchoolClass masterOfClass;

    public Teacher(SchoolClass masterOfClass) {
        this.masterOfClass = masterOfClass;
    }

    public Teacher(String name, String surname, LocalDate dateOfBirth, SchoolClass masterOfClass) {
        super(name, surname, dateOfBirth);
        this.masterOfClass = masterOfClass;
    }

    public Teacher() {
    }

    public SchoolClass getMasterOfClass() {
        return masterOfClass;
    }

    public void setMasterOfClass(SchoolClass masterOfClass) {
        this.masterOfClass = masterOfClass;
    }

    public boolean isMasterOfClass() {
        return true;

    }

    @Override
    public String toString() {
        if (isMasterOfClass()) {
            return "Teacher " +
                    super.getName() + " " +
                    super.getSurname() +
                    " (master of class: " + masterOfClass +
                    ")";
        } else {
            return "Teacher " +
                    super.getName() + " " +
                    super.getSurname() +
                    ")";
        }
    }
}
