package ru.skypro;

public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, String surname, String faculty, int conjure, int transgress, int hardworking, int loyal, int honest) {
        super(name, surname, faculty, conjure, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return super.toString() +
                "; трудолюбивость " + hardworking +
                "; верность " + loyal +
                "; честность " + honest;
    }
    public static void fullEquals(Hufflepuff student1, Hufflepuff student2) {
        if (student1.getHardworking() > student2.getHardworking()) {
            System.out.println(student1.getName() + " усерднее, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " усерднее, чем " + student1.getName());
        }
        if (student1.getLoyal() > student2.getLoyal()) {
            System.out.println(student1.getName() + " вернее, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " вернее, чем " + student1.getName());
        }
        if (student1.getHonest() > student2.getHonest()) {
            System.out.println(student1.getName() + " честнее, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " честнее, чем " + student1.getName());
        }
    }
}
