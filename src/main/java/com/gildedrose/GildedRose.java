package com.gildedrose;

import com.gildedrose.item.*;

import static com.gildedrose.item.ItemType.*;

class GildedRose {

    private Item[] items;

    // 생성자 인자로 Item -> 파라미터 복잡하지 않음
    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            Item item = itemFactory(items[i].getName(), items[i].getSellIn(), items[i].getQuality());
            item.changeQuality(item);
            items[i].setSellIn(item.getSellIn());
            items[i].setQuality(item.getQuality());
        }
    }

    //** 팩토리 메서드 **//
    private static Item itemFactory(ItemType name, int sellIn, int quality) {
        if (name.equals(AGED_BRIE)) {
            return new AgedBrieItem(name, sellIn, quality);
        } else if (name.equals(BACKSTAGE_PASSES)) {
            return new BackstagePassItem(name, sellIn, quality);
        } else if (name.equals(SULFURAS)) {
            return new SulfurasItem(name, sellIn, quality);
        } else {
            return new NormalItem(name, sellIn, quality);
        }
    }

    //** 헬퍼 메서드 **//

    /**
     * private static void changeQuality(Item item) {
     *
     *         ItemType itemType = checkItemType(item);
     *
     *         if (itemType.equals(SULFURAS)) {
     *             item.setQuality(80);
     *             return;
     *         }
     *
     *         item.setSellIn(item.getSellIn() - 1);
     *
     *         switch (itemType) {
     *             case AGED_BRIE:
     *                 item.setQuality(Math.min(50, item.getQuality() + 1));
     *                 if (item.getSellIn() < 0) {
     *                     item.setQuality(Math.min(50, item.getQuality() + 1));
     *                 }
     *                 break;
     *             case BACKSTAGE_PASSES:
     *                 if (item.getSellIn() < 0) {
     *                     item.setQuality(0);
     *                 } else {
     *                     int increase = 1;
     *                     if (item.getSellIn() < 10) increase++;
     *                     if (item.getSellIn() < 5) increase++;
     *                     item.setQuality(Math.min(50, item.getQuality() + increase));
     *                 }
     *                 break;
     *             case NORMAL:
     *                 item.setQuality(Math.max(0, item.getQuality() - 1));
     *                 if (item.getSellIn() < 0) {
     *                     item.setQuality(Math.max(0, item.getQuality() - 1));
     *                 }
     *                 break;
     *         }
     *     }
     *
     *     private static ItemType checkItemType(Item item) {
     *         if (item.getName().equals(AGED_BRIE)) {
     *             return AGED_BRIE;
     *         } else if (item.getName().equals(BACKSTAGE_PASSES)) {
     *             return BACKSTAGE_PASSES;
     *         } else if (item.getName().equals(SULFURAS)) {
     *             return SULFURAS;
     *         } else {
     *             return NORMAL;
     *         }
     *     }
     *
     */
}
