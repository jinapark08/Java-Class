package javaapp0410;

public class while04 {

	public static void main(String[] args) {
		// image3.png, image2.png,image1.png��
		// �����ư��� 4�� �ݺ�
		int idx = 0;

		while (idx < 12) {
			System.out.println("image" + (4 - (idx % 3 + 1)) + ".png");
			idx = idx + 1;

		}

	}

}
