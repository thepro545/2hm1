package ru.skypro;

import java.util.Objects;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, String faculty, int conjure, int transgress, int nobility, int honor, int bravery) {
        super(name, surname, faculty, conjure, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gryffindor that = (Gryffindor) o;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nobility, honor, bravery);
    }

    @Override
    public String toString() {
        return super.toString() +
                "; благородство " + nobility +
                "; честь " + honor +
                "; храбрость " + bravery;
    }
    public static void fullEquals(Gryffindor student1, Gryffindor student2) {
        if (student1.getBravery() > student2.getBravery()) {
            System.out.println(student1.getName() + " храбрее, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " храбрее, чем " + student1.getName());
        }
        if (student1.getHonor() > student2.getHonor()) {
            System.out.println(student1.getName() + " честнее, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " честнее, чем " + student1.getName());
        }
        if (student1.getNobility() > student2.getNobility()) {
            System.out.println(student1.getName() + " благороднее, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " благороднее, чем " + student1.getName());
        }
    }

}
