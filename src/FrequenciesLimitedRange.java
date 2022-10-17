import java.util.HashMap;

public class FrequenciesLimitedRange {
	public static void frequencyCount(int arr[], int N, int P) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		for (int i = 0; i < N; i++) {
			if (map.containsKey(i + 1)) {
				arr[i] = map.get(i + 1);
			} else {
				arr[i] = 0;
				;
			}
		}
	}

	public static void main(String[] args) {
		int N = 5;
		int arr[] = { 2, 3, 2, 3, 5 };
		int P = 5;
		frequencyCount(arr, N, P);
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
