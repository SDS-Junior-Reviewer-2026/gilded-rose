package com.gildedrose.item;

public class BackstagePassItem extends Item {

    public BackstagePassItem(ItemType name, int sellIn, int quality) {
        super(ItemType.BACKSTAGE_PASSES, sellIn, quality);
    }

    @Override
    public void changeQuality(Item item) {
        item.setSellIn(item.getSellIn() - 1);

        if (item.getSellIn() < 0) {
            item.setQuality(0);
        } else {
            int increase = 1;
            if (item.getSellIn() < 10) {
                increase++;
            }
            if (item.getSellIn() < 5) {
                increase++;
            }
            item.setQuality(Math.min(50, item.getQuality() + increase));
        }
    }

}
