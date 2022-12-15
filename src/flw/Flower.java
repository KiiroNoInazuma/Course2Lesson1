package flw;

import java.text.DecimalFormat;

public class Flower {
    final private String flowerName;
    final private String country;
    final private int lifeSpan;
    private double cost;
    private int manyFlowers;


    public Flower(String flowerName, String country, int lifeSpan, double cost) {
        if (flowerName == null || flowerName.isBlank()) {
            this.flowerName = "<<Flower type not specified>>";
        } else {
            this.flowerName = flowerName;
        }
        if (country == null || country.isBlank()) {
            this.country = "Russia";
        } else {
            this.country = country;
        }
        if (lifeSpan == 0 || lifeSpan < 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
        if (cost == 0 || cost < 0) {
            this.cost = 1.00;
        } else {
            this.cost = cost;
        }
    }

    public Flower(String flowerName, String country, double cost) {
        this(flowerName, country, 3, cost);
    }


    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getManyFlowers() {
        return manyFlowers;
    }

    public void setManyFlowers(int manyFlowers) {
        this.manyFlowers = manyFlowers;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        String day;
        if (lifeSpan == 1) {
            day = " day";
        } else {
            day = " days";
        }

        return flowerName + " from " + country + ", the cost of one piece is "
                + df.format(cost) + "₽. Standing time - " + lifeSpan + day;
    }
}
