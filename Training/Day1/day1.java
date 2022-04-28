import java.util.Scanner;

class day1{
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
		System.out.println(count);
	}
}