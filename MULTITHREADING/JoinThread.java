 class ChildJoinThread extends Thread {
   public void run(){
    for(int i=0;i<10;i++){
        System.out.println("Child Thread");
        try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
     }
    }
    
   }
    
}

public class JoinThread {
    public static void main(String[] args) throws InterruptedException
    {
      ChildJoinThread t = new ChildJoinThread();
      t.start();
      t.join();
      for (int i = 0; i < 10; i++) {
          System.out.println("main thread");  
      }
    
    }
}
