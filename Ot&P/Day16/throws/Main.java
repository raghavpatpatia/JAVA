class Main{
	public static int div(int x, int y) throws ArithmeticException{
		int divide = x / y;
		return divide;
	}
	
	public static void main(String[] args){
		Main obj = new Main();
		try{
			System.out.println(obj.div(10, 0));
		}
		catch(ArithmeticException e){
			System.out.println("Divide by 0");
		}
	}
}