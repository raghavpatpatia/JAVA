class multi{
	int a = 5;
}

class multi1 extends multi{
	int b = 10;
	int c = a + b;
	void get(){
		System.out.println("Value of c: " + c);
	}		
}

class Inheritance{
	public static void main(String[] args){
		multi1 m1 = new multi1();
		m1.get();
	}
}