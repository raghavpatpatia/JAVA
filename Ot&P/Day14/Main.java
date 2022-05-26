class Main{
	public static void main(String[] args){
		String str1 = new String("Hello, ");
		StringBuffer s = new StringBuffer("Raghav");
		String str2 = "world";
		int l = str1.length();
		String str3 = str1.concat(str2);
		System.out.println("Str1 equals Str2: " + str1.equals(str2));
		System.out.println(str1.indexOf(','));
		System.out.println(str3.toLowerCase());
		System.out.println(str3.toUpperCase());
		System.out.println(str3.substring(1, 4));
		System.out.println(str3);
		System.out.println(s.capacity());
		System.out.println(s.append(", How are you?"));
		System.out.println(s.capacity());
		System.out.println(l);
	}
}