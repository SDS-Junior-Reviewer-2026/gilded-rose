package com.gildedrose.item;

public class TicketItem extends Item {

    public TicketItem(Item item) {
        super(item.name, item.daysUntilExpiration, item.quality);
    }

    @Override
    public void updateQuality() {
        daysUntilExpiration--;

        if (daysUntilExpiration <= 0) {
            decreaseQuality(quality);
        } else if (daysUntilExpiration <= 5) {
            increaseQuality(3);
        } else if (daysUntilExpiration <= 10) {
            increaseQuality(2);
        } else {
            increaseQuality(1);
        }
    }
}
