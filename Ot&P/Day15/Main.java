import java.lang.Thread;

class MultiThread extends Thread{
	public void run(){
		try
		{
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		}
		catch(Exception e)
		{
			System.out.println("Exception is caught");	
		}
	}
}

class Main{
	public static void main(String[] args){
		for(int i = 0; i < 10; i++){
			MultiThread obj = new MultiThread();
			obj.start();
		}
	}
}