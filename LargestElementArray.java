
public class LargestElementArray {

	public static void main(String[] args) {
		double[] numArray = {22.2,24,30,50,60.5,10};
		double largest = numArray[0];
		
		for (double num: numArray) {
			if(largest <num)
				largest = num;
		}
		System.out.println("Lasgest element " +largest);

	}

}
