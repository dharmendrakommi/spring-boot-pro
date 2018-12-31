package com.vsoft.app;

public class Test {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 4, 3, 2, 1 };

		removeDuplicate(array, array.length);
		System.out.println(array.length);

	}

	private static void removeDuplicate(int[] array, int size) {

		for (int i = 0; i < size; i++) {

			for (int j = i + 1; j < size; j++) {

				if (array[i] == array[j]) {

					size--;

				}

			}

		}

		for (int k = 0; k < size; k++) {

			System.out.println(array[k]);

		}

	}

}
