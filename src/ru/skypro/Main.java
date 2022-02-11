package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Hogwarts("Гарри", "Поттер", "Гриффиндор", 100, 90),
                new Hogwarts("Гермиона", "Грейнджер", "Гриффиндор", 95, 100),
                new Hogwarts("Рон", "Уизли", "Гриффиндор", 90, 80),
                new Hogwarts("Драко", "Малфой", "Слизерин", 80, 80),
                new Hogwarts("Грэхэм", "Монтегю", "Слизерин", 70, 70),
                new Hogwarts("Грегори", "Гойл", "Слизерин", 50, 50),
                new Hogwarts("Захария", "Смит", "Пуффендуй", 75, 85),
                new Hogwarts("Седрик", "Диггори", "Пуффендуй", 65, 75),
                new Hogwarts("Джастин", "Финч-Флетчли", "Пуффендуй", 50, 55),
                new Hogwarts("Чжоу", "Чанг", "Когтевран", 50, 80),
                new Hogwarts("Падма", "Патил", "Когтевран", 60, 60),
                new Hogwarts("Маркус", "Белби", "Когтевран", 80, 40)

        };

        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри", "Поттер", "Гриффиндор", 100, 90, 95, 90, 99),
                new Gryffindor("Гермиона", "Грейнджер", "Гриффиндор", 95, 100, 100, 90, 80),
                new Gryffindor("Рон", "Уизли", "Гриффиндор", 90, 80, 80, 80, 50)
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария", "Смит", "Пуффендуй", 75, 85, 90, 70, 60),
                new Hufflepuff("Седрик", "Диггори", "Пуффендуй", 65, 75, 70, 80, 50),
                new Hufflepuff("Джастин", "Финч-Флетчли", "Пуффендуй", 50, 55, 50, 60, 40)
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу", "Чанг", "Когтевран", 50, 80, 90, 70, 60, 90),
                new Ravenclaw("Падма", "Патил", "Когтевран", 60, 60, 70, 80, 50, 80),
                new Ravenclaw("Маркус", "Белби", "Когтевран", 80, 40, 50, 60, 40, 85)

        };

        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой", "Слизерин", 80, 80, 100, 90, 80, 80, 100),
                new Slytherin("Грэхэм", "Монтегю", "Слизерин", 70, 70, 80, 70, 30, 40, 20),
                new Slytherin("Грегори", "Гойл", "Слизерин", 50, 50, 70, 40, 20, 10, 10)
        };

        printStudents(gryffindors[1]);
        fullEquals(gryffindors);
        fullEquals(hufflepuffs);
        fullEquals(ravenclaws);
        fullEquals(slytherins);
        powerEquals(hogwarts);
    }

    public static void printStudents(Hogwarts hogwarts) {
        System.out.println(hogwarts);
    }

    public static void fullEquals(Gryffindor[] gryffindors) {
        if (gryffindors[1].getBravery() > gryffindors[2].getBravery()) {
            System.out.println(gryffindors[1].getName() + " храбрее, чем " + gryffindors[2].getName());
        } else {
            System.out.println(gryffindors[2].getName() + " храбрее, чем " + gryffindors[1].getName());
        }
        if (gryffindors[1].getHonor() > gryffindors[2].getHonor()) {
            System.out.println(gryffindors[1].getName() + " честнее, чем " + gryffindors[2].getName());
        } else {
            System.out.println(gryffindors[2].getName() + " честнее, чем " + gryffindors[1].getName());
        }
        if (gryffindors[1].getNobility() > gryffindors[2].getNobility()) {
            System.out.println(gryffindors[1].getName() + " благороднее, чем " + gryffindors[2].getName());
        } else {
            System.out.println(gryffindors[2].getName() + " благороднее, чем " + gryffindors[1].getName());
        }
    }

    public static void fullEquals(Hufflepuff[] hufflepuffs) {
        if (hufflepuffs[1].getHardworking() > hufflepuffs[2].getHardworking()) {
            System.out.println(hufflepuffs[1].getName() + " усерднее, чем " + hufflepuffs[2].getName());
        } else {
            System.out.println(hufflepuffs[2].getName() + " усерднее, чем " + hufflepuffs[1].getName());
        }
        if (hufflepuffs[1].getLoyal() > hufflepuffs[2].getLoyal()) {
            System.out.println(hufflepuffs[1].getName() + " вернее, чем " + hufflepuffs[2].getName());
        } else {
            System.out.println(hufflepuffs[2].getName() + " вернее, чем " + hufflepuffs[1].getName());
        }
        if (hufflepuffs[1].getHonest() > hufflepuffs[2].getHonest()) {
            System.out.println(hufflepuffs[1].getName() + " честнее, чем " + hufflepuffs[2].getName());
        } else {
            System.out.println(hufflepuffs[2].getName() + " честнее, чем " + hufflepuffs[1].getName());
        }
    }

    public static void fullEquals(Ravenclaw[] ravenclaws) {
        if (ravenclaws[1].getCreativity() > ravenclaws[2].getCreativity()) {
            System.out.println(ravenclaws[1].getName() + " креативнее, чем " + ravenclaws[2].getName());
        } else {
            System.out.println(ravenclaws[2].getName() + " креативнее, чем " + ravenclaws[1].getName());
        }
        if (ravenclaws[1].getSmart() > ravenclaws[2].getSmart()) {
            System.out.println(ravenclaws[1].getName() + " умнее, чем " + ravenclaws[2].getName());
        } else {
            System.out.println(ravenclaws[2].getName() + " умнее, чем " + ravenclaws[1].getName());
        }
        if (ravenclaws[1].getWise() > ravenclaws[2].getWise()) {
            System.out.println(ravenclaws[1].getName() + " мудрее, чем " + ravenclaws[2].getName());
        } else {
            System.out.println(ravenclaws[2].getName() + " мудрее, чем " + ravenclaws[1].getName());
        }
        if (ravenclaws[1].getWitty() > ravenclaws[2].getWitty()) {
            System.out.println(ravenclaws[1].getName() + " остроумнее, чем " + ravenclaws[2].getName());
        } else {
            System.out.println(ravenclaws[2].getName() + " остроумнее, чем " + ravenclaws[1].getName());
        }
    }

    public static void fullEquals(Slytherin[] slytherins) {
        if (slytherins[1].getLustForPower() > slytherins[2].getLustForPower()) {
            System.out.println(slytherins[1].getName() + " жаждит власть больше, чем " + slytherins[2].getName());
        } else {
            System.out.println(slytherins[2].getName() + " жаждит власть больше, чем " + slytherins[1].getName());
        }
        if (slytherins[1].getResourcefulness() > slytherins[2].getResourcefulness()) {
            System.out.println(slytherins[1].getName() + " находчивее, чем " + slytherins[2].getName());
        } else {
            System.out.println(slytherins[2].getName() + " находчивее, чем " + slytherins[1].getName());
        }
        if (slytherins[1].getAmbition() > slytherins[2].getAmbition()) {
            System.out.println(slytherins[1].getName() + " абмициознее, чем " + slytherins[2].getName());
        } else {
            System.out.println(slytherins[2].getName() + " абмициознее, чем " + slytherins[1].getName());
        }
        if (slytherins[1].getDetermination() > slytherins[2].getDetermination()) {
            System.out.println(slytherins[1].getName() + " решительнее, чем " + slytherins[2].getName());
        } else {
            System.out.println(slytherins[2].getName() + " решительнее, чем " + slytherins[1].getName());
        }
        if (slytherins[1].getCunning() > slytherins[2].getCunning()) {
            System.out.println(slytherins[1].getName() + " хитрее, чем " + slytherins[2].getName());
        } else {
            System.out.println(slytherins[2].getName() + " хитрее, чем " + slytherins[1].getName());
        }
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
