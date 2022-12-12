package Homework1;

public class Launcher {
    public static void main(String[] args) {

        Human maks = new Human(1988, "Максим", "Минск", "бренд-менеджер");
        Human anna = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        Human kat = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        Human arty = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");


        System.out.println(maks);
        System.out.println(anna);
        System.out.println(kat);
        System.out.println(arty);
    }
}
