// Using ‘this’ keyword to refer current class instance variables
class abc{
	int a;
	int b;
	abc(int a, int b){
		this.a = a;
		this.b = b;
	}
	void display(){
		System.out.println("a: " + a + ", b: " + b);
	}
}

class this1{
	public static void main(String[] args){
		abc x = new abc(10, 20);
		x.display();
	}
}