package Tasks;

import java.util.*;

public class Task5 {

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
		System.out.print(" Enter the target ");
		int target = sc.nextInt();
		int number1 = 0, number2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					number1 = arr[i];
					number2 = arr[j];
				}
			}
		}
		if (number1 > 0) {
			System.out.println(" Numbers are : " + number1 + " " + number2);
		} else {
			System.out.println(" No numbers are present ");
		}
		sc.close();
	}

}
