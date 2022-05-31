class Main{
	public static void main(String[] args){
		try{
			int a = 10, b = 0, c;
			c = a/b;
			System.out.println(c);
			throw new ArithmeticException("throwing arthimetic exception");
		}
		catch(ArithmeticException e){
			System.out.println("Divide by 0");
		}
	}
}