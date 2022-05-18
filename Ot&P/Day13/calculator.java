import p1.Add;
import p1.sub;
import p1.mul;
import p1.div;
class calculator{
	public static void main(String[] args){
		int choice;
		System.out.println("Enter your choice:(1, 2, 3, 4)");
		System.out.println("1. Add");
		System.out.println("2. Sub");
		System.out.println("3. Mul");
		System.out.println("4. Div");
		switch(choice){
			case 1:
				Add a = new Add();
				System.out.println(a.get());
				break;
			case 2:
				sub a = new sub();
				System.out.println(a.get());
				break;
			case 3:
				mul a = new mul();
				System.out.println(a.get());
				break;
			case 4:
				div a = new div();
				System.out.println(a.get());
				break;
			default:
				System.out.println("Try Again");
				break;
		}
	}
}