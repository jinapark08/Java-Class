package javaapp0410;

public class while02 {

	public static void main(String[] args) {

		
		// image1.png, image2.png,image3.png을
		//번갈아가며 3번 반복
		
     	int idx = 0;
		while (idx<9) {
			System.out.println("image"+(idx%3+1)+".png");
			idx = idx +1;

		}
		

}
	
}
