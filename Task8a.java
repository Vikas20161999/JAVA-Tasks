package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task8a {

	public static int[] SliceArray(int a[], int startIndex, int endIndex) {
		int result[] = new int[endIndex - startIndex + 1];
		for (int i = 0, j = startIndex; i < result.length; i++, j++) {
			result[i] = a[j];
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the size of array ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print(" Enter the elements of array ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(" The Array is " + Arrays.toString(arr));
		int result[]=SliceArray(arr,3,6);
		System.out.println(" The Slice Array " + Arrays.toString(result));
		sc.close();
	}

}
