package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	
	private int arraySize = 0;
	Object[] items = new Object[10];
	

	@Override
	public boolean add(T item) {	
		if (arraySize == items.length) {
            ensureCapacity();
        }
		items[arraySize++] = item;
		
		return true;
	}
	
	private void ensureCapacity() {
        int newSize =items.length * 2;
        items = Arrays.copyOf(items, newSize);
    }
		
	

	@Override
	public int getSize() {
		
		return arraySize;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if(index >= arraySize)
			throw new IndexOutOfBoundsException(index);
		return (T) items[index];
		
		
	}
	
	@Override
	public boolean add(int index, T item) {
		if(index > arraySize) {
			throw new IndexOutOfBoundsException(index);
		}
		if(arraySize == items.length) {
			 ensureCapacity();
		}
		for(int i = arraySize - 1; i > index; i--) {
			items[i+1] = items[i];
		}
		items[index] = item;
		arraySize++;
		return true;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) {
		if(index >= arraySize) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		T removedItem = (T) items[index];
		
		for(int i = index; i < arraySize - 1; i++) {
			items[i] = items[i + 1];
		}
		arraySize--;
		return removedItem;
	}
	
}
