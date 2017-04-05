import java.util.ArrayList;
import java.util.Iterator;
public class TestingMod {
	public static void main(String[] args) {
		System.out.println("zero mod 3: " + 0%3);
		System.out.println("-1 mod 2: " + -1%2);
		System.out.println("2 mod -1: " + 2%-1);
		int[] arr = {1, 2, 3, 4, 5};
		//easyMethod2(arr, 0, arr.length);
		testingIterators();
	}

	public static void easyMethod2(int[] array, int low, int high) {
		if (array[low] == 0) {
			for (int i = low; i < high; i += 1) {
				System.out.println(array[i]);
			}
		}
		easyMethod2(array, low, low + (high - low) / 2);
		easyMethod2(array, low + (high - low) / 2, high);
	}

	public static void testingIterators() {
		ArrayList<Integer> list = new ArrayList<>();
		int n = 5;
		while (n > 0) {
			n--;
		list.add(n);
		}
		Iterator<Integer> it = list.iterator();
		System.out.print(it.next() + " ");
		for (int i : list)
			System.out.print(i + " ");
		System.out.print(it.hasNext() + "\n");
	}
}