class xyz{
	xyz(){
		System.out.println("Constructor is called");
	}

	void print_hello(){
		System.out.println("Hello constructor");
	}
}

class pqr{
	String name;
	int age;
	pqr(String name, int age){
		this.name = name;
		this.age = age;
	}
}

class constructor{
	public static void main(String[] args){
		xyz abc = new xyz();
		abc.print_hello();
		pqr def = new pqr("Raghav", 21);
		System.out.println("Name: " + def.name + ", Age: " + def.age);
	}
}