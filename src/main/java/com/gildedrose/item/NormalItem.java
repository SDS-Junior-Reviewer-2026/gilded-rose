package com.gildedrose.item;

public class NormalItem extends Item {

    public NormalItem(int sellIn, int quality) {
        super(ItemType.NORMAL, sellIn, quality);
    }

    @Override
    public void changeQuality() {
        setSellIn(getSellIn() - 1);

        setQuality(Math.max(0, getQuality() - 1));
        if (getSellIn() < 0) {
            setQuality(Math.max(0, getQuality() - 1));
        }
    }
}
