package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	
	private CustomList<Integer> sut;

	@Test
	void should_add_one_item_to_list() {
		sut = new CustomArrayList<>();
		sut.add(10);
		
		Integer expectedResult = sut.get(0);
		Integer expectedSize = sut.getSize();
	
		assertEquals(10, expectedResult);
		assertEquals(1, expectedSize);
	}
	
	@Test
	void should_add_100_items_to_list() {

		 sut = new CustomArrayList<Integer>();
		for (int i = 1; i < 101; i++) {
			sut.add(i);
		}
		for (int i = 0; i < 100; i++) {
			assertEquals(i + 1, sut.get(i));
		}
		assertEquals(100, sut.getSize());
	}
	
	@Test
	void should_return_size_of_list() {
	    sut = new CustomArrayList<>();
		sut.add(1);
		sut.add(2);
		sut.add(3);
		sut.add(4);
		sut.add(5);
		sut.add(6);
		sut.add(7);
		sut.add(8);
		sut.add(9);
		sut.add(10);
		sut.add(11);
		sut.add(12);
		Integer expectedSize = sut.getSize();
		assertEquals(12, expectedSize);
	}

	@Test
	void should_get_index_in_list() {
		 sut = new CustomArrayList<>();
		for (int i = 0; i < 15; i++) {
			sut.add(i);
		}
		Integer expectedIndex = sut.get(12);
		assertEquals(12, expectedIndex);
}
	@Test
	void should_add_item_to_list() {

		 sut = new CustomArrayList<>();
		sut.add(0, 10);
		Integer expectedResult = sut.get(0);
		assertEquals(10, expectedResult);
	}

	@Test
	void should_throw_array_out_of_bounds_exception() {
		 sut = new CustomArrayList<>();
		for (int i = 0; i < 15; i++) {
			sut.add(i);
		}
		assertThrows(IndexOutOfBoundsException.class, () -> sut.add(25, 1));
	}
	
	@Test
	void should_throw_out_of_bounds_exception() {
		sut = new CustomArrayList<>();
		for (int i = 0; i < 12; i++) {
			sut.add(i);
		}
		assertThrows(IndexOutOfBoundsException.class, () -> sut.add(20, 1));
	}

	@Test
	void should_remove_item() {
		 sut = new CustomArrayList<>();
		sut.add(1);
		sut.add(2);
		sut.add(3);
		sut.add(4);
		sut.add(5);
		sut.add(6);
		sut.add(7);
		sut.add(8);

		sut.remove(0);
		Integer expectedResult = sut.get(5);
		assertEquals(7, expectedResult);
	}
	
	@Test
	void should_throw_exception_if_out_of_array() {
		 sut = new CustomArrayList<>();
		sut.add(1);
		sut.add(2);
		sut.add(3);
		sut.add(4);
		sut.add(5);
		sut.add(6);
		sut.add(7);
	
		assertThrows(IndexOutOfBoundsException.class, () -> sut.remove(10));
	}
	@Test
	void should_throw_exception_if_index_higher_than_size() {
		sut = new CustomArrayList<>();
		sut.add(1);
		sut.add(2);
		sut.add(3);
		sut.add(4);
		sut.add(5);
		sut.add(6);
		sut.add(7);
		
		
		assertThrows(IndexOutOfBoundsException.class, () -> sut.get(50));
	}
}
