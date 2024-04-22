package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task7b {
	
	public static int LinearSearch(int a[], int ele) {
		int indexOf=-1;
		for(int i=0; i<a.length;i++) {
			if(a[i]==ele) {
				indexOf=i;
			}
		}
		return indexOf;
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
		System.out.println(" Enter the element you want to search :  ");
		int e1=sc.nextInt();
		System.out.println(LinearSearch(arr, e1));
		sc.close();
	}

}
