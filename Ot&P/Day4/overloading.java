class over{
	void display(int a){
		System.out.println(a);
	}
	void display(String a){
		System.out.println(a);
	}
}

class overloading{
	public static void main(String[] args){
		over x = new over();
		x.display(10);
		x.display("Hello");
	}
}