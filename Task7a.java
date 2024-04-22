package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task7a {
	
	public static String BruteForceSort(int a[]) {
		for(int i=0; i<a.length;i ++) {
			for(int j=i+1; j<a.length; j++) {
				int temp=0;
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return Arrays.toString(a);
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
		System.out.print(" Sorted Array is " + BruteForceSort(arr));
		sc.close();
	}

}
