import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int largest = 0;
		int secondLargest = 0;

		int[] array = {20, 25, 30, 50, 1};
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				secondLargest = largest;
				largest = array[i];

			} else if (array[i] > secondLargest) {
				secondLargest = array[i];
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("The Second Largest Number is :" + secondLargest);

	}

}
