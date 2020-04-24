package javaapp0423;

public class BubbleSolt {

	public static void main(String[] args) {

		int[] ar = { 30, 40, 10, 50, 20 };
		int data = ar.length;
		System.out.println("변경전:");
		for (int i = 0; i < data; i++) {
			System.out.printf("%5d", ar[i]);
		}
		for (int i = 0; i < data - 1; i++) {
			for (int j = 0; j < data - (i + 1); j++) {
				if (ar[i] < ar[j]) {
					int cnt = ar[i];
					ar[i] = ar[j];
					ar[j] = cnt;

				}

			}
		}
		System.out.println("\n" + "변경후:");
		for (int i = 0; i < data; i++) {
			System.out.printf("%5d", ar[i]);

		}
	}
}
