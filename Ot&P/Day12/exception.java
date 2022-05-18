import java.util.Scanner;

class exception{
	public static void main(String[] args){	
		try {
			Scanner sc = new Scanner(System.in);
			int a, b, c;
			System.out.print("Enter number1: ");
			a = sc.nextInt();
			System.out.print("Enter number2: ");
			b = sc.nextInt();
			c = a / b;
			System.out.println("a / b: " + c);
		}

		catch (ArithmeticException e){
			System.out.println(e);
		}

		finally { 
			int d = 10 + 20;
			System.out.println("10 + 20: " + d);  
		}
	}
}