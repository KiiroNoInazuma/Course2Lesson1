package flw;

import java.text.DecimalFormat;

public class Bouquet {
    private Flower[] flower;


    Bouquet(Flower... flower) {
        this.flower = flower;
    }

    private double costBouquet(Flower flower, int manyFlowers) {
        return flower.getCost() * manyFlowers;
    }

    private int bestBeforeDate() {
        int min = Integer.MAX_VALUE;
        for (Flower fw : flower) {
            min = Integer.min(min, fw.getLifeSpan());
        }
        return min;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        String allBouquet = "";
        double costFlowers = 0;
        int totalFlowers = 0;
        for (int i = 0; i < flower.length; i++) {
            if (i != flower.length - 1) {
                allBouquet += flower[i].getFlowerName() + ", ";
            } else {
                allBouquet += flower[i].getFlowerName() + ". ";
            }
            costFlowers += costBouquet(flower[i], flower[i].getManyFlowers());
            totalFlowers += flower[i].getManyFlowers();
        }
        return "Compound: " + allBouquet + "\nThe cost of the bouquet is " + df.format(costFlowers * 1.1) + "₽" +
                "\nBouquet shelf life: " + bestBeforeDate() + "\nThe bouquet contains " + totalFlowers + " flowers.";
    }
}

