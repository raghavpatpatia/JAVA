import java.util.Scanner;

class prime{
	public static void main(String[] args){
		int a, i, count = 0;
		System.out.print("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		a = Integer.parseInt(scanner.nextLine());
		for(i = 1; i <= a; i++){
			if(a%i == 0){
				System.out.println(i);
				count++;
			}
		}
		if(count > 2)
		{
			System.out.println("not prime");
		}
		else{
			System.out.println("prime");
		}
	}
}