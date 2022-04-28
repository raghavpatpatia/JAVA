// Using ‘this’ keyword as an argument in the constructor call

class abc{
	xyz z;
	abc(xyz z){
		this.z = z;
		z.print();
	}
}

class xyz{
	int b = 15896;
	xyz(){
		abc z = new abc(this);
	}
	void print(){
		System.out.println("Hello, Brother");
	}
}

class this6{
	public static void main(String[] args){
		xyz a = new xyz();
	}
}