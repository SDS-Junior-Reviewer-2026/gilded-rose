package com.gildedrose;


import com.gildedrose.item.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseTest {

	public static final String NONAME = "noname";
	public static final String AGED_BRIE = "Aged Brie";
	public static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
	public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

	@Test
	public void test() {

		Item[] items = new Item[]{
				new Item("noname", 0, 0)
		};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(1, items.length);
		assertEquals(-1, items[0].daysUntilExpiration);
		assertEquals(0, items[0].getQuality());
		assertEquals("noname, -1, 0", items[0].toString());
	}

	@Test
	public void should_be_nothing_when_no_item() {
		// given (arrange)
		Item[] items = new Item[]{};
		GildedRose gildedRose = new GildedRose(items);

		// when (act)
		gildedRose.updateQuality();

		// then (assert)
		assertEquals(0, items.length);
	}

	@Test
	public void noname_daysUntilExpiration_0_quality_0 () {
		Item[] items = new Item[]{ new Item(NONAME, 0, 0) };
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(-1, items[0].daysUntilExpiration);
		assertEquals(0, items[0].getQuality());

	}

	@Test
	public void noname_daysUntilExpiration_0_quality_1 () {
		Item[] items = new Item[]{ new Item(NONAME, 0, 1) };
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(-1, items[0].daysUntilExpiration);
		assertEquals(0, items[0].getQuality());
	}

	@Test
	public void noname_daysUntilExpiration_10_quality_1 () {
		Item[] items = new Item[]{ new Item(NONAME, 10, 1) };
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(9, items[0].daysUntilExpiration);
		assertEquals(0, items[0].getQuality());
	}

	@Test
	public void agedBrie_daysUntilExpiration_0_quality_0 () {
		Item[] items = new Item[]{ new Item(AGED_BRIE, 0, 0) };
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(-1, items[0].daysUntilExpiration);
		assertEquals(2, items[0].getQuality());
	}

	@Test
	public void agedBrie_daysUntilExpiration_0_quality_50 () {
		Item[] items = new Item[]{ new Item(AGED_BRIE, 0, 50) };
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(-1, items[0].daysUntilExpiration);
		assertEquals(50, items[0].getQuality());
	}

	@Test
	public void agedBrie_daysUntilExpiration_10_quality_0 () {
		Item[] items = new Item[]{ new Item(AGED_BRIE, 10, 0) };
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(9, items[0].daysUntilExpiration);
		assertEquals(1, items[0].getQuality());
	}

	@Test
	public void backstage_pass_daysUntilExpiration_0_quality_0 () {
		Item[] items = new Item[]{ new Item(BACKSTAGE_PASS, 0, 0) };
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(-1, items[0].daysUntilExpiration);
		assertEquals(0, items[0].getQuality());
	}

	@Test
	public void backstage_pass_daysUntilExpiration_0_quality_49 () {
		Item[] items = new Item[]{ new Item(BACKSTAGE_PASS, 0, 49) };
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(-1, items[0].daysUntilExpiration);
		assertEquals(0, items[0].getQuality());
	}

	@Test
	public void backstage_pass_daysUntilExpiration_12_quality_0 () {
		Item[] items = new Item[]{ new Item(BACKSTAGE_PASS, 12, 0) };
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(11, items[0].daysUntilExpiration);
		assertEquals(1, items[0].getQuality());
	}

	@Test
	public void backstage_pass_daysUntilExpiration_9_quality_0 () {
		Item[] items = new Item[]{ new Item(BACKSTAGE_PASS, 9, 0) };
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(8, items[0].daysUntilExpiration);
		assertEquals(2, items[0].getQuality());
	}

	@Test
	public void backstage_pass_daysUntilExpiration_4_quality_0 () {
		Item[] items = new Item[]{ new Item(BACKSTAGE_PASS, 4, 0) };
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(3, items[0].daysUntilExpiration);
		assertEquals(3, items[0].getQuality());
	}

	@Test
	public void sulfuras_daysUntilExpiration_0_quality_80 () {
		Item[] items = new Item[]{ new Item(SULFURAS, 0, 80) };
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(0, items[0].daysUntilExpiration);
		assertEquals(80, items[0].getQuality());
	}

	@Test
	public void sulfuras_daysUntilExpiration_m2_quality_80 () {
		Item[] items = new Item[]{ new Item(SULFURAS, -2, 80) };
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(-2, items[0].daysUntilExpiration);
		assertEquals(80, items[0].getQuality());
	}
}
