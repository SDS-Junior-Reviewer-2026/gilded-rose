package com.gildedrose.item;

public class NormalItem extends Item {

    public NormalItem(ItemType name, int sellIn, int quality) {
        super(ItemType.NORMAL, sellIn, quality);
    }

    @Override
    public void changeQuality(Item item) {
        item.setSellIn(item.getSellIn() - 1);

        item.setQuality(Math.max(0, item.getQuality() - 1));
        if (item.getSellIn() < 0) {
            item.setQuality(Math.max(0, item.getQuality() - 1));
        }
    }
}
