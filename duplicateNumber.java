
public class duplicateNumber {

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 3, 6, 1, 4 };

		System.out.println("Duplicate Number :");

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j])
					System.out.println(array[j]);
			}

		}
	}
}
