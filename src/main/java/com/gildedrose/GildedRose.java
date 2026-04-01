package com.gildedrose;

import com.gildedrose.item.FermentedItem;
import com.gildedrose.item.Item;
import com.gildedrose.item.LegendaryItem;
import com.gildedrose.item.TicketItem;

class GildedRose {

    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
        for (int i = 0; i < items.length; i++) {
            switch (items[i].name) {
                case AGED_BRIE:
                    items[i] = new FermentedItem(items[i]);
                    break;
                case BACKSTAGE_PASS:
                    items[i] = new TicketItem(items[i]);
                    break;
                case SULFURAS:
                    items[i] = new LegendaryItem(items[i]);
                    break;
                default:
                    break;
            }
        }
    }

    public void updateQuality() {
        for (Item item : items) {
            item.updateQuality();
        }
    }
}
