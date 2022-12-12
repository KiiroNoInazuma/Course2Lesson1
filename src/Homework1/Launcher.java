package Homework1;

public class Launcher {
    public static void main(String[] args) {
        Human maks = new Human();
        maks.name = "Максим";
        maks.yearOfBirth = 1988;
        maks.town = "Минск";
        maks.jobTitle = "бренд-менеджер";

        Human anna = new Human();
        anna.name = "Аня";
        anna.yearOfBirth = 1993;
        anna.town = "Москва";
        anna.jobTitle = "методист образовательных программ";

        Human kat = new Human();
        kat.name = "Катя";
        kat.yearOfBirth = 1992;
        kat.town = "Калининград";
        kat.jobTitle = "продакт-менеджер";

        Human arty = new Human();
        arty.name = "Артем";
        arty.yearOfBirth = 1995;
        arty.town = "Москва";
        arty.jobTitle = "директор по развитию бизнеса";

        System.out.println(maks);
        System.out.println(anna);
        System.out.println(kat);
        System.out.println(arty);
        System.out.println();
    }
}
