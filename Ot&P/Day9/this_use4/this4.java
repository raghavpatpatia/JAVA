// Using ‘this’ keyword as method parameter

class abc{
	String name;
	abc(String name){
		this.name = name;
	}
	
	void display(abc x){
		System.out.println("Hello, " + x.name);
	}

	void print(){
		display(this);
	}	
}

class this4{
	public static void main(String[] args){
		abc x = new abc("Raghav");
		x.print();
	}
}