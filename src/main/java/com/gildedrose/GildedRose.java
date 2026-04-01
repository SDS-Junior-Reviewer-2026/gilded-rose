package com.gildedrose;

class GildedRose {

    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (SULFURAS.equals(item.name)) continue;

            item.daysUntilExpiration--;

            switch (item.name) {
                case AGED_BRIE:
                    updateCheeseQuality(item);
                    break;
                case BACKSTAGE_PASS:
                    updateTicketQuality(item);
                    break;
                default:
                    updateNormalQuality(item);
                    break;
            }
        }
    }

    private void updateCheeseQuality(Item item) {
        if (item.daysUntilExpiration < 0) {
            item.increaseQuality(2);
        } else {
            item.increaseQuality(1);
        }
    }

    private void updateTicketQuality(Item item) {
        if (item.daysUntilExpiration <= 0) {
            item.decreaseQuality(item.getQuality());
        } else if (item.daysUntilExpiration <= 5) {
            item.increaseQuality(3);
        } else if (item.daysUntilExpiration <= 10) {
            item.increaseQuality(2);
        } else {
            item.increaseQuality(1);
        }
    }

    private void updateNormalQuality(Item item) {
        if (item.daysUntilExpiration < 0) {
            item.decreaseQuality(2);
        } else {
            item.decreaseQuality(1);
        }
    }
}
