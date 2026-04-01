package com.gildedrose.item;

public class AgedBrieItem extends Item {

    public AgedBrieItem(ItemType name, int sellIn, int quality) {
        super(ItemType.AGED_BRIE, sellIn, quality);
    }

    @Override
    public void changeQuality(Item item) {
        item.setSellIn(item.getSellIn() - 1);

        item.setQuality(Math.min(50, item.getQuality() + 1));
        if (item.getSellIn() < 0) {
            item.setQuality(Math.min(50, item.getQuality() + 1));
        }
    }
}
