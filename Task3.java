package myFirstPro;

public class Task3 {
	
	public static void main(String[] args) {
		Runnable Obj=()->System.out.println("Thread created");
		Thread thread= new Thread(Obj);
		thread.start();
		System.out.println("Name of the thread: "+thread.getName());
		}

}