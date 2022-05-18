package p1;
import java.util.Scanner;
class Add{
 	void get(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number1:");
		int a = s.nextInt();
		System.out.println("Enter number2:");
		int b = s.nextInt();
		int c = a + b;
		System.out.println("Value of number1 + number2 = " + c);
	}
}