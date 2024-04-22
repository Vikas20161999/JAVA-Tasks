package Tasks;

import java.util.*;

public class Task9a {
	public static String ConvertS(String s1, String s2, int l1) {
		String s = s1.concat(s2);   // Concatenation
		// System.out.println(s);
		String revStr = "";     
		for (int i = 0; i < s.length(); i++) {
			revStr = s.charAt(i) + revStr;      //Reverse of String
		}
		int startIndex = (revStr.length() - l1) / 2;
		String s3 = revStr.substring(startIndex, startIndex + l1);   //Printing Substring equal to length
		return s3;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter First String ");
		String s1 = sc.nextLine();
		System.out.print(" Enter Second String ");
		String s2 = sc.nextLine();
		if (s1 == "" || s2 == "") {
			System.out.println("String is Invalid");
		} else {
			System.out.print(" Enter Length of Substring ");
			int l = sc.nextInt();
			if (l > (s1.length() + s2.length())) {
				System.out.println(" Invalid Length Input ");
			} else {
				System.out.println(ConvertS(s1, s2, l));
			}
		}
		sc.close();
	}
}
