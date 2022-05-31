interface A{
	public void p1();
}

interface B{
	public void p2();
}

class C implements A, B{
	public void p1(){
		System.out.println("Function p1");
	}
	
	public void p2(){
		System.out.println("Function p2");
	}
}

class Main{
	public static void main(String[] args){
		C obj = new C();
		obj.p1();
		obj.p2();
	}
}