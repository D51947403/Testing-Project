package singraul.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {

		PlayMovie  t1= new PlayMovie();
               t1.start();
               
        PlayMusic obj = new PlayMusic();
        // // Using the constructor Thread(Runnable r)  
            Thread t2= new Thread(obj);
            t2.start();
	}

}
 class PlayMovie extends Thread {
	 @Override
	 public void run () {
		 System.out.println("Playing movie ....!");
	 }
 }
 
 class PlayMusic implements Runnable{
	 @Override
	 public void run() {
		 System.out.println("Playing music .....!");
	 }
 }