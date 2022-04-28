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
	int b = 6;
	void multiverse1(){
		System.out.println("Value of b: " + b);
	}
}

class multi3 extends multi2{
	int c = 7;
	void multiverse2(){
		System.out.println("Value of c: " + c);
	}
}

class multi{
	public static void main(String[] args){
		multi3 d = new multi3();
		d.multiverse();
		d.multiverse1();
		d.multiverse2();
	}
}