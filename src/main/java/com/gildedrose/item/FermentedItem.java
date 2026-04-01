package com.gildedrose.item;

public class FermentedItem extends Item {

    public FermentedItem(Item item) {
        super(item.name, item.daysUntilExpiration, item.quality);
    }

    @Override
    public void updateQuality() {
        daysUntilExpiration--;

        if (daysUntilExpiration < 0) {
            increaseQuality(2);
        } else {
            increaseQuality(1);
        }
    }
}
