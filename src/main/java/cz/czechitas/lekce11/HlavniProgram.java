package cz.czechitas.lekce11;

import cz.czechitas.lekce11.grafika.Ctverec;
import cz.czechitas.lekce11.grafika.Trojuhelnik;
import cz.czechitas.lekce11.grafika.Tvar;
import cz.czechitas.lekce11.school.Parent;
import cz.czechitas.lekce11.school.Person;
import cz.czechitas.lekce11.school.Student;
import cz.czechitas.lekce11.school.Teacher;

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

//        1. student
        Student tomasProkes = new Student();
        tomasProkes.setName("Tomas");
        tomasProkes.setSurname("Prokes");
        tomasProkes.setDateOfBirth(LocalDate.of(1985, 06, 01));
        tomasProkes.setClas("4.B");
        tomasProkes.setGrades(List.of(1, 2, 3, 1, 2));
        System.out.println(tomasProkes);

//        2. student
        Student vlastimilCernicek = new Student("Vlastimil", "Cernicek", LocalDate.of(1985, 07, 01), "4.C", List.of(1, 2, 3, 2, 1));
        System.out.println(vlastimilCernicek);

        // teacher
        Teacher filipJirsak = new Teacher("Filip", "Jirsak", LocalDate.of(1980, 01, 01), "4.B");
        System.out.println(filipJirsak);

//        parent
        Parent jarmilaProkesova = new Parent("Jarmila", "Prokesova", LocalDate.of(1965, 06, 01), List.of(tomasProkes));
        System.out.println(jarmilaProkesova);

    }

    private void nakreslitTvar(Tvar tvar) {
        tvar.nakreslit();
    }

}
