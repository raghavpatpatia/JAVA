// Using this() to invoke current class constructor
class abc{
	String name;
	abc(){
		this("Raghav");
		System.out.println("Hello, " + name);
	}
	abc(String name){
		this.name = name;
	}
}

class this2{
	public static void main(String[] args){
		abc x = new abc();
	}
}