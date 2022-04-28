class a{
	final int a = 10;
	// int a = 50;
	int b = 20;
	int c = a + b;
	void print1(){
		System.out.println(a);
		System.out.println(c);
	}
}

class b extends a{
	int d = 40;
	final void print1(){
		super.print1();
		System.out.println(d);
	}
}

final class Finalcase{
	public static void main(String[] args){
		b obje = new b();
		obje.print1();
	}
}