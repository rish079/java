class myRunnable implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Child Thread");
		}
	}
}
public class ThreadDemo{
	public static void main(String[] args){
		myRunnable r = new myRunnable();
		Thread t = new Thread(r);
		t.start();
		for(int i =0;i<10;i++){
			System.out.println("Main Thread");
		}
		
	}
}