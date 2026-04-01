package com.gildedrose.item;

public class Item {

    public String name;

    public int daysUntilExpiration;

    protected int quality;

    public Item(String name, int daysUntilExpiration, int quality) {
        this.name = name;
        this.daysUntilExpiration = daysUntilExpiration;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.daysUntilExpiration + ", " + this.quality;
    }

    public int getQuality() {
        return quality;
    }

    public void updateQuality() {
        daysUntilExpiration--;

        if (daysUntilExpiration < 0) {
            decreaseQuality(2);
        } else {
            decreaseQuality(1);
        }
    }

    protected void increaseQuality(int value) {
        quality += value;
        if (quality > 50) {
            quality = 50;
        }
    }

    protected void decreaseQuality(int value) {
        quality -= value;
        if (quality < 0) {
            quality = 0;
        }
    }
}
