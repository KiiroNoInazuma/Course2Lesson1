package flw;

public class LauncherFlowers {
    public static void main(String[] args) {

        Flower rose = new Flower("Rose", "Holland", 1, 5.5144);
        rose.setManyFlowers(1);
        Flower chrysanthemum = new Flower("Chrysanthemum", "", 15, 5);
        chrysanthemum.setManyFlowers(2);
        Flower peony = new Flower("Peony", "England", 1, 69.9);
        peony.setManyFlowers(2);
        Flower gypsophila = new Flower("Gypsophila", "Turkey", 10, 19.5);
        gypsophila.setManyFlowers(3);


        Bouquet bq = new Bouquet(rose, chrysanthemum, peony, gypsophila);

        System.out.println(bq);
    }
}
