// Using ‘this’ keyword to return the current class instance

class abc{
	int a;
	int b;
	abc(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	abc get(){
		return this;
	}

	void print(){
		System.out.println("a: " + a + ", b: " + b);
	}
}

class this3{
	public static void main(String[] args){
		abc x = new abc(10, 20);
		x.get().print();
	}
}