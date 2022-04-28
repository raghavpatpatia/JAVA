abstract class abc{
	abstract void print();
}

class def extends abc{
	void print(){
		System.out.println("Hello, Raghav");
	}
}

class abstractclass{
	public static void main(String[] args){
		def x = new def();
		x.print();
	}
}