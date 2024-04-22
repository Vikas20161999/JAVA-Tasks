package Tasks;

import java.util.*;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter a Number ");
		int n = sc.nextInt();
		int count = 0;
		if (n == 0 || n == 1) {
			System.out.println("Invalid input");
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					count += 1;
				}
			}
			if (count > 0) {
				System.out.println("Not Prime");
			} else {
				System.out.println("Prime");
			}
		}
		sc.close();

	}

}
