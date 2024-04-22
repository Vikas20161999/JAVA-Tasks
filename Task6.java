package Tasks;

import java.util.Arrays;
import java.util.Scanner;

//a) Write a recursive function named SumArray that calculates and returns the sum of elements in an array, demonstarte with example.
public class Task6 {
	public static int SumArray(int a[]) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the size of array ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.print(" Enter the elements of array ");
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(" The Array is " +Arrays.toString(arr));
		System.out.println(" The Sum of Array is " + SumArray(arr));
		sc.close();
	}
	

}
