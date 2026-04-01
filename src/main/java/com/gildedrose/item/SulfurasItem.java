package com.gildedrose.item;

public class SulfurasItem extends Item {

    public SulfurasItem(int sellIn, int quality) {
        super(ItemType.SULFURAS, sellIn, quality);
    }

    @Override
    public void changeQuality() {
        setQuality(80);
    }

}
