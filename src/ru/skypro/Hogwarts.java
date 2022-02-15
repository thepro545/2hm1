package ru.skypro;

import java.util.Objects;

public class Hogwarts {
    private String name;
    private String surname;
    private String faculty;
    private int conjure;
    private int transgress;

    public Hogwarts(String name, String surname, String faculty, int conjure, int transgress) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.conjure = conjure;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getConjure() {
        return conjure;
    }

    public void setConjure(int conjure) {
        this.conjure = conjure;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }


    @Override
    public String toString() {
        return
                "Ученик - " + name +
                        " " + surname +
                        "; Факультет " + faculty +
                        "; Сила магии " + conjure +
                        "; расстояние трансгрессии " + transgress + "; ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return conjure == hogwarts.conjure && transgress == hogwarts.transgress && name.equals(hogwarts.name) && surname.equals(hogwarts.surname) && faculty.equals(hogwarts.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, faculty, conjure, transgress);
    }

    public static void powerEquals(Hogwarts[] hogwarts){
        if (hogwarts[0].getConjure() > hogwarts[5].getConjure()) {
            System.out.println(hogwarts[0].getName() + " сильнее в магия, чем " + hogwarts[5].getName());
        } else {
            System.out.println(hogwarts[5].getName() + " сильнее в магия, чем " + hogwarts[0].getName());
        }
        if (hogwarts[0].getTransgress() > hogwarts[5].getTransgress()) {
            System.out.println("У "+ hogwarts[0].getName() + " расстояни трансгрессии больше, чем у " + hogwarts[5].getName());
        } else {
            System.out.println("У "+ hogwarts[5].getName() + " расстояни трансгрессии больше, чем у " + hogwarts[0].getName());
        }
    }
}
