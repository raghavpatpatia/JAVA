class multi1{
	int a = 5;
	void multiverse(){
		System.out.println(a);
	}
}

class multi2 extends multi1{
	int b = 6;
	void multiverse1(){
		System.out.println(b);
	}
}

class multi3 extends multi2{
	int c = 7;
	void multiverse2(){
		System.out.println(c);
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