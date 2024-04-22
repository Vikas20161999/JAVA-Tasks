package Tasks;
import java.util.*;
class Task2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter a Operator from +, -, *, / ");
		String s=sc.nextLine();
		System.out.print(" Enter the two numbers ");
		int n1=sc.nextInt(),n2=sc.nextInt();;
		
		int result=0;
		switch(s){
			case "+":
				result=n1+n2;
				break;
			case "-":
				result=n1-n2;
				break;
			case "*":
				result=n1*n2;
				break;
			case "/":
				result=n1/n2;
				break;
		}
		System.out.println(" Result = " + result);
		sc.close();
	}
}