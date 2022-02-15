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
        Gryffindor.fullEquals(gryffindors[1],gryffindors[2]);
        Hufflepuff.fullEquals(hufflepuffs[1], hufflepuffs[2]);
        Ravenclaw.fullEquals(ravenclaws[0],ravenclaws[2]);
        Slytherin.fullEquals(slytherins[0], slytherins[1]);
        Hogwarts.powerEquals(hogwarts);
    }

    public static void printStudents(Hogwarts hogwarts) {
        System.out.println(hogwarts);
    }


}
