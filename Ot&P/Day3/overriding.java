import java.util.Scanner;

class multi1{
	void multiverse(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter value of a: ");
		String a = scanner.nextLine();
		System.out.println("Value of a: " + a);
	}
	
}

class multi2 extends multi1{
	void multiverse(){
		super.multiverse();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter value of b: ");
		String b = scanner.nextLine();
		System.out.println("Value of b: " + b);
	}
}


class overriding{
	public static void main(String[] args){
		multi2 a = new multi2();
		a.multiverse();
	}
}