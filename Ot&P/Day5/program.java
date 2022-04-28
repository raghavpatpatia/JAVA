class program{
	public static void main(String[] args){
		int a = 10, b = 20, c = 30;
		String e = "Hello, ";
		System.out.println(e + "Raghav");
		System.out.print("10 << 2: ");
		System.out.println(a << 2);
		System.out.print("20 >> 2: ");
		System.out.println(b >> 2);
		System.out.print("10 | 2: ");
		System.out.println(a | 2);
		System.out.print("10 & 2: ");
		System.out.println(a & 14);
		System.out.print("20 ^ 2: ");
		System.out.println(b ^ 14);
		System.out.println("Printing lines from 1 to 30:");
		for(int i = 1; i <= c; i++){
			System.out.println("Line number " + i);
		}
	}
}