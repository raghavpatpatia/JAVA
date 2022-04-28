// Using ‘this’ keyword to invoke current class method 

class abc{
	void print(){
		this.show();		
	}

	void show(){
		System.out.println("Using 'this' keyword to invoke current class method ");
	}
}

class this5{
	public static void main(String[] args){
		abc x = new abc();
		x.print();
	}
}