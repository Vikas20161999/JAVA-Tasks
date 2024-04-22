package Tasks;

import java.util.Scanner;

public class Task8b {
	public static int fib(int n1) {
		if (n1 == 0) {
			return 0;
		} if(n1==1){
			return 1;
		}else {
			return fib(n1 - 1) + fib(n1 - 2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter a Number ");
		int n = sc.nextInt();
		System.out.println(fib(n));
		for(int i=0; i<n; i++) {
			System.out.print(fib(i)+" ");
		}
		sc.close();
	}

}
