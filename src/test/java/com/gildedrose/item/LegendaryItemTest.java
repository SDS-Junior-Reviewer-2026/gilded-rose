package com.gildedrose.item;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LegendaryItemTest {

    @Test
    void updateQuality_daysUntilExpiration_0_quality_90() {
        Item item = new Item("Legendary Item", 0, 90);
        LegendaryItem legendaryItem = new LegendaryItem(item);

        legendaryItem.updateQuality();
        assertEquals(0, legendaryItem.daysUntilExpiration);
        assertEquals(90, legendaryItem.quality);
    }

    @Test
    void increaseQuality_daysUntilExpiration_0_quality_90() {
        Item item = new Item("Legendary Item", 0, 90);
        LegendaryItem legendaryItem = new LegendaryItem(item);

        legendaryItem.increaseQuality(10);
        assertEquals(0, legendaryItem.daysUntilExpiration);
        assertEquals(100, legendaryItem.quality);
    }

    @Test
    void increaseQuality_negative_assertThrows() {
        Item item = new Item("Legendary Item", 0, 90);
        LegendaryItem legendaryItem = new LegendaryItem(item);

        assertThrows(IllegalArgumentException.class, () -> legendaryItem.increaseQuality(-10));
    }
}