class program1{
	static int binary(int x){
		int ans = 0, multi = 1;
		while (x != 0){
			int rem = x % 2;
			ans  = ans + rem * multi;
			x = x / 2;
			multi = multi * 10;
		} 
		return ans;
	}
	
	public static void main(String[] args){
		int x = 57;
		System.out.println(binary(x));
	}
}