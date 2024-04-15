package cz.czechitas.lekce11;

import cz.czechitas.lekce11.grafika.Ctverec;
import cz.czechitas.lekce11.grafika.Trojuhelnik;
import cz.czechitas.lekce11.grafika.Tvar;
import cz.czechitas.lekce11.school.*;

import java.time.LocalDate;
import java.util.List;

/**
 * Hlavní třída aplikace.
 */
public class HlavniProgram implements Runnable {
    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String[] args) {
        new HlavniProgram().run();
    }

    /**
     * Hlavní metoda obsahující výkonný kód.
     */
    @Override
    public void run() {
//        nakreslitTvar(new Ctverec());
//        nakreslitTvar(new Trojuhelnik());

        // school class
        SchoolClass b4 = new SchoolClass(4, "B");
        System.out.println(b4);

        // 1. student
        Student johnDoe = new Student();
        johnDoe.setName("John");
        johnDoe.setSurname("Doe");
        johnDoe.setDateOfBirth(LocalDate.of(2014, 06, 01));
        johnDoe.setSchoolClass(new SchoolClass(4, "B"));
        johnDoe.setGrades(List.of(1, 2, 3, 1, 2));
        System.out.println(johnDoe);

        // 2. student
        Student annBoe = new Student("Ann", "Boe", LocalDate.of(2014, 07, 01), new SchoolClass(4, "C"), List.of(1, 2, 3, 2, 1));
        System.out.println(annBoe);

        // teacher
        Teacher davidBeck = new Teacher("David", "Beck", LocalDate.of(1980, 01, 01), new SchoolClass(4, "B"));
        System.out.println(davidBeck);

//        parent
        Parent janeDoe = new Parent("Jane", "Doe", LocalDate.of(1990, 06, 01), List.of(johnDoe));
        System.out.println(janeDoe);

    }

    private void nakreslitTvar(Tvar tvar) {
        tvar.nakreslit();
    }

}
