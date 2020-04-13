package javaapp0410;

public class while03 {

	public static void main(String[] args) {
		System.out.println("=======");

		// image1.png, image3.png,image5.png을
		// 번갈아가며 4번 반복
		int idx = 0;
		while (idx < 12) {
			System.out.println("image" + (idx % 3 * 2 + 1) + ".png");
			idx = idx + 1;
		}
	}

}
