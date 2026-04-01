package com.gildedrose.item;

public class AgedBrieItem extends Item {

    public AgedBrieItem(ItemType name, int sellIn, int quality) {
        super(ItemType.AGED_BRIE, sellIn, quality);
    }

    @Override
    public void changeQuality() {
        setSellIn(getSellIn() - 1);

        setQuality(Math.min(50, getQuality() + 1));
        if (getSellIn() < 0) {
            setQuality(Math.min(50, getQuality() + 1));
        }
    }
}
