import java.lang.reflect.Array;

public class AscendingOrder {

	public static void main(String[] args) {

		int[] array = { 5, 2, 3, 4, 1 };
		int temp = 0;
		System.out.println("Number of Elements :");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");

		}

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}

			}

		}
		System.out.println();
		System.out.println("Ascending Order :");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}
}
