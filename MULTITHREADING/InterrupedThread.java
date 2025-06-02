class InnerInterrupedThread extends Thread {
     public void run(){
        try{
        for (int i = 0; i < 10; i++) {
            System.out.println("This is a lazy Thread and it executes after every 3s");
            Thread.sleep(3000);
        }
        }catch(InterruptedException e){
            System.out.println("now i cant execute");
        }
     }
    
}

public class InterrupedThread {
    public static void main(String[] args)  {
        InnerInterrupedThread t = new InnerInterrupedThread();
        t.start();
        t.interrupt();
        System.out.println("end of interrupted method");

    }
}

// IN THE ABOVE CODE THE INTERRUPTED() METHOD WILL EXECUTE ONLY WHEN THE CHILD THREAD ENTER INTO SLEEP OR WAITING STATE
//INTERRUPTED METHOD WILL NOT EXECUTE UNTIL THE TARGETED CHILD THREAD GO INTO SLEEP STATE

