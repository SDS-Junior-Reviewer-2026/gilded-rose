package com.gildedrose.item;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void increaseQuality_negative_assertThrows() {
        Item item = new Item("Item", 0, 90);

        assertThrows(IllegalArgumentException.class, () -> item.increaseQuality(-10));
    }

    @Test
    void decreaseQuality_negative_assertThrows() {
        Item item = new Item("Item", 0, 90);

        assertThrows(IllegalArgumentException.class, () -> item.decreaseQuality(-10));
    }
}