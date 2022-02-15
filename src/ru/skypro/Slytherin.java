package ru.skypro;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, String surname, String faculty, int conjure, int transgress, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, faculty, conjure, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                "; хитрость" + cunning +
                "; решительность " + determination +
                "; амбициозность " + ambition +
                "; находчивость " + resourcefulness +
                "; жажда власти " + lustForPower;
    }
    public static void fullEquals(Slytherin student1, Slytherin student2) {
        if (student1.getLustForPower() > student2.getLustForPower()) {
            System.out.println(student1.getName() + " жаждит власть больше, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " жаждит власть больше, чем " + student1.getName());
        }
        if (student1.getResourcefulness() > student2.getResourcefulness()) {
            System.out.println(student1.getName() + " находчивее, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " находчивее, чем " + student1.getName());
        }
        if (student1.getAmbition() > student2.getAmbition()) {
            System.out.println(student1.getName() + " абмициознее, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " абмициознее, чем " + student1.getName());
        }
        if (student1.getDetermination() > student2.getDetermination()) {
            System.out.println(student1.getName() + " решительнее, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " решительнее, чем " + student1.getName());
        }
        if (student1.getCunning() > student2.getCunning()) {
            System.out.println(student1.getName() + " хитрее, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " хитрее, чем " + student1.getName());
        }
    }
}
