package Homework1;


public class LauncherFlowers {
    public static void main(String[] args) {
        Flower rose = new Flower("Rose", "Holland", 1, 5.5144);
        Flower chrysanthemum = new Flower("Chrysanthemum", "", 15, 5);
        Flower peony = new Flower("Peony", "England", 1, 69.9);
        Flower gypsophila = new Flower("Gypsophila", "Turkey", 10, 19.5);

        System.out.println(rose);
        System.out.println(chrysanthemum);
        System.out.println(peony);
        System.out.println(gypsophila);
    }
}
