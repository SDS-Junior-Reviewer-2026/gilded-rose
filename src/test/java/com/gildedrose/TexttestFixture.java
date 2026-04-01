package com.gildedrose;

import com.gildedrose.item.*;

import static com.gildedrose.item.ItemType.*;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
                new NormalItem(NORMAL, 10, 20), //
                new AgedBrieItem(AGED_BRIE, 2, 0), //
                new NormalItem(NORMAL, 5, 7), //
                new SulfurasItem(SULFURAS, 0, 80), //
                new SulfurasItem(SULFURAS, -1, 80),
                new BackstagePassItem(BACKSTAGE_PASSES, 15, 20),
                new BackstagePassItem(BACKSTAGE_PASSES, 10, 49),
                new BackstagePassItem(BACKSTAGE_PASSES, 5, 49),
                // this conjured item does not work properly yet
                new NormalItem(NORMAL, 3, 6) };

        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}