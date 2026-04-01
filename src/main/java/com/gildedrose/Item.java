package com.gildedrose;

public class Item {

    private ItemType name;
    private int sellIn;
    private int quality;

    public Item(ItemType name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public ItemType getName() {
        return this.name;
    }

    public int getSellIn() {
        return this.sellIn;
    }

    public int getQuality() {
        return this.quality;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
