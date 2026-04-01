package com.gildedrose.item;

public class BackstagePassItem extends Item {

    public BackstagePassItem(ItemType name, int sellIn, int quality) {
        super(ItemType.BACKSTAGE_PASSES, sellIn, quality);
    }

    @Override
    public void changeQuality() {
        setSellIn(getSellIn() - 1);

        if (getSellIn() < 0) {
            setQuality(0);
        } else {
            int increase = 1;
            if (getSellIn() < 10) {
                increase++;
            }
            if (getSellIn() < 5) {
                increase++;
            }
            setQuality(Math.min(50, getQuality() + increase));
        }
    }

}
