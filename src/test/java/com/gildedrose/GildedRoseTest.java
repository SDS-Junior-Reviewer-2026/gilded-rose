package com.gildedrose;


import com.gildedrose.item.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseTest {

	@Test
	void should_be_nothing_when_no_item() {
		// given
		Item[] items = new Item[] {};
		GildedRose app = new GildedRose(items);

		// when
		app.updateQuality();

		// then
		assertEquals(0, items.length);
	}

	@Test
	void noname_sellin_0_quality_0() {
		// given
		Item[] items = new Item[] { new NormalItem(0, 0) };
		GildedRose app = new GildedRose(items);

		// when
		app.updateQuality();

		// then
		assertEquals(-1, items[0].getSellIn());
		assertEquals(0, items[0].getQuality());
	}

	@Test
	void noname_sellin_0_quality_1() {
		// given
		Item[] items = new Item[] { new NormalItem(0, 1) };
		GildedRose app = new GildedRose(items);

		// when
		app.updateQuality();

		// then
		assertEquals(-1, items[0].getSellIn());
		assertEquals(0, items[0].getQuality());
	}

	@Test
	void sulfuras_sellin_0_quality_80() {
		// given
		Item[] items = new Item[] { new SulfurasItem(0, 80) };
		GildedRose app = new GildedRose(items);

		// when
		app.updateQuality();

		// then
		assertEquals(0, items[0].getSellIn());
		assertEquals(80, items[0].getQuality());
	}

	@Test
	void agedBrie_sellin_0_quality_0() {
		// given
		Item[] items = new Item[] { new AgedBrieItem(0, 0) };
		GildedRose app = new GildedRose(items);

		// when
		app.updateQuality();

		// then
		assertEquals(-1, items[0].getSellIn());
		assertEquals(2, items[0].getQuality());
	}

	@Test
	void backstagePasses_sellin_0_quality_0() {
		// given
		Item[] items = new Item[] { new BackstagePassItem(0, 0) };
		GildedRose app = new GildedRose(items);

		// when
		app.updateQuality();

		// then
		assertEquals(-1, items[0].getSellIn());
		assertEquals(0, items[0].getQuality());
	}

	@Test
	void backstagePasses_sellin_0_quality_49() {
		// given
		Item[] items = new Item[] { new BackstagePassItem(0, 49) };
		GildedRose app = new GildedRose(items);

		// when
		app.updateQuality();

		// then
		assertEquals(-1, items[0].getSellIn());
		assertEquals(0, items[0].getQuality());
	}

	@Test
	void backstagePasses_sellin_12_quality_0() {
		// given
		Item[] items = new Item[] { new BackstagePassItem(12, 0) };
		GildedRose app = new GildedRose(items);

		// when
		app.updateQuality();

		// then
		assertEquals(11, items[0].getSellIn());
		assertEquals(1, items[0].getQuality());
	}

	@Test
	void sulfuras_sellin_m2_quality_80() {
		// given
		Item[] items = new Item[] { new SulfurasItem(-2, 80) };
		GildedRose app = new GildedRose(items);

		// when
		app.updateQuality();

		// then
		assertEquals(-2, items[0].getSellIn());
		assertEquals(80, items[0].getQuality());
	}

	@Test
	void agedBrie_sellin_0_quality_50() {
		// given
		Item[] items = new Item[] { new AgedBrieItem(0, 50) };
		GildedRose app = new GildedRose(items);

		// when
		app.updateQuality();

		// then
		assertEquals(-1, items[0].getSellIn());
		assertEquals(50, items[0].getQuality());
	}

	//** 브랜치 누락된 것 위한 테스트 코드 아래 추가 **//
	// -> "조건의 모든 경로(T/F)를 갔는가?"

	@Test
	void normal_sellin_5_quality_10() {
		// given
		Item[] items = new Item[] { new NormalItem(5, 10) };
		GildedRose app = new GildedRose(items);

		// when
		app.updateQuality();

		// then
		assertEquals(4, items[0].getSellIn());
		assertEquals(9, items[0].getQuality());
	}

	@Test
	void agedBrie_sellin_5_quality_10() {
		// given
		Item[] items = new Item[] { new AgedBrieItem(5, 10) };
		GildedRose app = new GildedRose(items);

		// when
		app.updateQuality();

		// then
		assertEquals(4, items[0].getSellIn());
		assertEquals(11, items[0].getQuality());
	}

	@Test
	void backstagePasses_sellin_10_quality_20() {
		// given
		Item[] items = new Item[] { new BackstagePassItem(10, 20) };
		GildedRose app = new GildedRose(items);

		// when
		app.updateQuality();

		// then
		assertEquals(9, items[0].getSellIn());
		assertEquals(22, items[0].getQuality());
	}

	@Test
	void backstagePasses_sellin_5_quality_20() {
		// given
		Item[] items = new Item[] { new BackstagePassItem(5, 20) };
		GildedRose app = new GildedRose(items);

		// when
		app.updateQuality();

		// then
		assertEquals(4, items[0].getSellIn());
		assertEquals(23, items[0].getQuality());
	}

}