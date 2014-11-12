import java.util.Arrays;

public class ArrayExercises2 {
	public static void main(String[] args) {
		statistics();
	}

	public static void statistics() {
		int arr[] = {9,3,44,17,50,5,77};
		int arr2[] = {8,-6,89,17,12,6}; 
		int sum = 0;
		double avg = 0;
		for (int i : arr) {
			sum += i;
			avg = sum / arr.length;
		}
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(calculateMedian(arr2));
		calculateRange(arr2);
	}

	public static double calculateMedian(int[] arr) {
		Arrays.sort(arr);
		double median = 0;
		int count = 0;
		if (arr.length % 2 == 0) {
			count = (arr.length / 2);
			int lower = arr[count - 1];
			median = ((lower + arr[count]) / 2);
		}
		else {
			for (int i : arr) {
				count++;
			}
			count = (count / 2);
			median = arr[count];
		}
		return median;
	}

	public static double calculateRange(int[] arr) {
		Arrays.sort(arr);
		int range = (arr[arr.length-1] - arr[0]);
		System.out.println(range);
		return range;
	}
}