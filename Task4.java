package Tasks;

import java.util.*;

public class Task4 {
	 static void reverse(int a[]) 
	    { 
		 for(int i=a.length-1; i>=0;i--) {
			 
			 System.out.print(a[i]+" ");
		 } 
	    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print(" Enter size of an array ");
		int n = sc.nextInt();
		sc.close();
		int i;
		int arr[] = new int[n];
		for (i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
		System.out.println(" Original Array : "+ Arrays.toString(arr));
		
		System.out.print(" Array in reverse order : ");
		reverse(arr);
	}
	
	

}
