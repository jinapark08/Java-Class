package javaapp0410;

public class while01 {

	public static void main(String[] args) {
		// image1.png, image2.png,image3.png,image4.png �� 
		//������� ����ϵ��� while�� �ۼ� 
		
		int idx = 1;
		
		while (idx<5) {
			System.out.println("image"+(idx)+".png");
			idx = idx +1;
			
			
		}
		
		System.out.println ("=======");
		
		// image1.png, image2.png,image3.png,image4.png, 
		//image1.png, image2.png,image3.png,image4.png�� 
		//������� ����ϵ��� while�� �ۼ� 
		while (idx<9) {
			System.out.println("image"+(idx %4+1)+".png");
			idx = idx +1;
			
			
		}
		
	}
}
