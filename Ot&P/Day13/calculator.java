import p1.Add;
import p1.sub;
import p1.mul;
import p1.div;
import java.util.Scanner;
class calculator{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int choice;
		System.out.println("Enter your choice:(1, 2, 3, 4)");
		System.out.println("1. Add");
		System.out.println("2. Sub");
		System.out.println("3. Mul");
		System.out.println("4. Div");
		choice = scan.nextInt();
		switch(choice){
			case 1:
				Add a = new Add();
				a.get();
				break;
			case 2:
				sub b = new sub();
				b.get();
				break;
			case 3:
				mul c = new mul();
				c.get();
				break;
			case 4:
				div d = new div();
				d.get();
				break;
			default:
				System.out.println("Try Again");
				break;
		}
	}
}