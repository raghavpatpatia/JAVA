import java.util.Scanner;
class Main{
	static int a = 10;
	static void multiplyByTen(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int b = sc.nextInt();
		int c = a * b;
		System.out.println("value after multiplying by 10: " + c);
	}
	public static void main(String[] args){
		multiplyByTen();
	}
}