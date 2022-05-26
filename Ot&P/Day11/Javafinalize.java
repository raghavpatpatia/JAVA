class Javafinalize{  
	public static void main(String[] args){   
		Javafinalize obj = new Javafinalize();  
		obj.get(); 
		System.out.println(obj.hashCode());
		System.out.println("method");   
		obj = null;   
		// calling garbage collector    
		System.gc();   
		System.out.println("end of garbage collection");
		obj.get();
	}   

	@Override  
	protected void finalize()   
	{   
		System.out.println("finalize method called");   
	}   
	
	public void get(){
		System.out.println("last");   
	}
} 