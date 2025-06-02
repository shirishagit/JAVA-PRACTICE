 class InnerChildJoinThread extends Thread{

    static Thread mt;
    public void run(){
        try {
            mt.join();
        } catch (Exception e) {}
        for(int i = 0;i<10;i++){
            System.out.println("child thread");
        }
        
    }
} 


public class ChildJoinThread {
    public static void main(String[] args) throws InterruptedException {
       InnerChildJoinThread.mt =Thread.currentThread();
       InnerChildJoinThread t = new InnerChildJoinThread() ;
       t.start();
       for(int i=0;i<10;i++){
        System.out.println("Main Thread");
        Thread.sleep(5000);
       }
    }
}


//IN THE ABOVE CODE THE CHILD THREAD WAITS UNTIL THE MAIN THREAD COMPLETS ITS EXECUTION 
