package com.gildedrose;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseTest {
	private final String SULFURAS = "Sulfuras, Hand of Ragnaros";
	private final String AGED_BRIE = "Aged Brie";
	private final String NONAME = "noname";
	private final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";

	@Test
	void test_no_item() {
		Item[] items = new Item[]{};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(0, items.length);
	}

	@Test
	void noname_sellin_0_quality_0() {
		Item[] items = new Item[]{
				new Item(NONAME, 0, 0)
		};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(1, items.length);
		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);
	}

	@Test
	void noname_sellin_0_quality_1() {
		Item[] items = new Item[]{
				new Item(NONAME, 0, 1)
		};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(1, items.length);
		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);
	}

	@Test
	void noname_sellin_1_quality_1() {
		Item[] items = new Item[]{
				new Item(NONAME, 1, 1)
		};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(1, items.length);
		assertEquals(0, items[0].sellIn);
		assertEquals(0, items[0].quality);
	}

	@Test
	void noname_sellin_0_quality_10() {
		Item[] items = new Item[]{
				new Item(NONAME, 0, 10)
		};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(1, items.length);
		assertEquals(-1, items[0].sellIn);
		assertEquals(8, items[0].quality);
	}

	@Test
	void sulfuras_sellin_m2_quality_80() {
		Item[] items = new Item[]{
				new Item(SULFURAS, -2, 80)
		};

		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(1, items.length);
		assertEquals(-2, items[0].sellIn);
		assertEquals(80, items[0].quality);
	}

	@Test
	void sulfuras_sellin_0_quality_80() {
		Item[] items = new Item[]{
				new Item(SULFURAS, 0, 80)
		};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(0, items[0].sellIn);
		assertEquals(80, items[0].quality);
	}

	@Test
	void backstage_pass_sellin_0_quality_0() {
		Item[] items = new Item[]{
				new Item(BACKSTAGE_PASS, 0, 0)
		};

		GildedRose gildedRose = new GildedRose(items);
		gildedRose.updateQuality();

		assertEquals(1, items.length);
		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);
	}

	@Test
	void backstage_pass_sellin_0_quality_49() {
		Item[] items = new Item[]{
				new Item(BACKSTAGE_PASS, 0, 49)
		};

		GildedRose gildedRose = new GildedRose(items);
		gildedRose.updateQuality();

		assertEquals(1, items.length);
		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);
	}

	@Test
	void backstage_pass_sellin_12_quality_50() {
		Item[] items = new Item[]{
				new Item(BACKSTAGE_PASS, 12, 0)
		};

		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();
		assertEquals(11, items[0].sellIn);
		assertEquals(1, items[0].quality);
	}

	@Test
	void backstage_pass_sellin_5_quality_10() {
		Item[] items = new Item[]{
				new Item(BACKSTAGE_PASS, 5, 10)
		};

		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();
		assertEquals(4, items[0].sellIn);
		assertEquals(13, items[0].quality);
	}

	@Test
	void agedBrie_sellin_0_quality_50() {
		Item[] items = new Item[]{
				new Item(AGED_BRIE, 0, 50)
		};
		GildedRose gildedRose = new GildedRose(items);
		gildedRose.updateQuality();
		assertEquals(1, items.length);
		assertEquals(-1, items[0].sellIn);
		assertEquals(50, items[0].quality);
	}

	@Test
	void agedBrie_sellin_0_quality_0() {
		Item[] items = new Item[]{
				new Item(AGED_BRIE, 0, 0)
		};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(1, items.length);
		assertEquals(-1, items[0].sellIn);
		assertEquals(2, items[0].quality);
	}

	@Test
	void agedBrie_sellin_1_quality_0() {
		Item[] items = new Item[]{
				new Item(AGED_BRIE, 1, 0)
		};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(1, items.length);
		assertEquals(0, items[0].sellIn);
		assertEquals(1, items[0].quality);
	}
}
