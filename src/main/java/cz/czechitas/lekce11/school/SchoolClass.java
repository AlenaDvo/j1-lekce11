package cz.czechitas.lekce11.school;

public class SchoolClass {
    private int year;
    private String letter;

    public SchoolClass(int year, String letter) {
        this.year = year;
        this.letter = letter;
    }

    public SchoolClass() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return "School class " +
                year +
                "." + letter;
    }
}
