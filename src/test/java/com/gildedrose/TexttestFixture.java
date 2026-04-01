package com.gildedrose;

import com.gildedrose.item.*;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
                new NormalItem(10, 20), //
                new AgedBrieItem(2, 0), //
                new NormalItem(5, 7), //
                new SulfurasItem(0, 80), //
                new SulfurasItem(-1, 80),
                new BackstagePassItem(15, 20),
                new BackstagePassItem(10, 49),
                new BackstagePassItem(5, 49),
                // this conjured item does not work properly yet
                new NormalItem(3, 6) };

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