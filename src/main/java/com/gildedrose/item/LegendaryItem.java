package com.gildedrose.item;

public class LegendaryItem extends Item {

    public LegendaryItem(Item item) {
        super(item.name, item.daysUntilExpiration, item.quality);
    }

    @Override
    public void updateQuality() {}

    @Override
    protected void increaseQuality(int value) throws IllegalArgumentException {
        if (value < 0) throw new IllegalArgumentException("Negative value is not allowed");
        quality += value;
    }
}
