package com.gildedrose.item;

public class LegendaryItem extends Item {

    public LegendaryItem(Item item) {
        super(item.name, item.daysUntilExpiration, item.quality);
    }

    @Override
    public void updateQuality() {
        return;
    }

    @Override
    protected void increaseQuality(int value) {
        quality += value;
    }
}
