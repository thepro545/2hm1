package ru.skypro;

public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, String surname, String faculty, int conjure, int transgress, int smart, int wise, int witty, int creativity) {
        super(name, surname, faculty, conjure, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString() +
                "; ум " + smart +
                "; мудрость " + wise +
                "; остроумность " + witty +
                "; креативность" + creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public static void fullEquals(Ravenclaw student1, Ravenclaw student2) {
        if (student1.getCreativity() > student2.getCreativity()) {
            System.out.println(student1.getName() + " креативнее, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " креативнее, чем " + student1.getName());
        }
        if (student1.getSmart() > student2.getSmart()) {
            System.out.println(student1.getName() + " умнее, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " умнее, чем " + student1.getName());
        }
        if (student1.getWise() > student2.getWise()) {
            System.out.println(student1.getName() + " мудрее, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " мудрее, чем " + student1.getName());
        }
        if (student1.getWitty() > student2.getWitty()) {
            System.out.println(student1.getName() + " остроумнее, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " остроумнее, чем " + student1.getName());
        }
    }

}
