package Day2;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 23, 2, 4, 56, 80, 23, 12, 34, 5, 23 };
		// searching by using the binary search technique
		int pos = binsearch(arr, 56, arr.length);
		if (pos != -1)
			System.out.println(" The values is found at the position of " + pos);
	}

	public static int binsearch(int[] dataset, int target, int n) {
		insertsort(dataset, n);
		int i;
		int pos = -1;
		int found = 0;
		if (target < dataset[n / 2]) {
			//look in the first half 
			for (i = 0; i < n / 2 && found != 1; i++)
				if (target == dataset[i]) {
					found = 1;
					pos = i;
				}
		} else {
			 //look in the second half
			for (i = n / 2; i < n && found != 1; i++)
				if (target == dataset[i]) {
					found = 1;
					pos = i;
				}
		}
		return pos;
	}

	public static void insertsort(int[] dataset, int n) {
		int i, j;
		for (i = 1; i < n; i++) {
			int pick_item = dataset[i];
			int inserted = 0;
			for (j = i - 1; j >= 0 && inserted != 1;) {
				if (pick_item < dataset[j]) {
					dataset[j + 1] = dataset[j];
					j--;
					dataset[j + 1] = pick_item;
				} else
					inserted = 1;
			}
		}
	}
}

