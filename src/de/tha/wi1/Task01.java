package de.tha.wi1;

public class Task01 {

	public static void main(String[] args) {

		int[] rnd = { 17, 83, 64, 5, 90, 48, 71, 3, 27, 66, 14, 95, 9, 56, 78, 22, 60, 99, 2, 31 };
		int temp;
		for (int i = 0; i < rnd.length; i++) {
			int min = i;

			for (int j = i + 1; j < rnd.length; j++) {
				if (rnd[j] < rnd[min]) {
					min = j;
				}
			}
			temp = rnd[i];
			rnd[i] = rnd[min];
			rnd[min] = temp;

			System.out.printf("Schritt %d: ", i);
			for (int j = 0; j < rnd.length; j++) {
				System.out.print(rnd[j] + " ");
			}

			System.out.println();
		}

	}
}
