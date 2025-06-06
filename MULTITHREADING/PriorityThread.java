class InnerPriorityThread  extends Thread{
   
}

public class PriorityThread {
    public static void main(String[] args) {
      Thread.currentThread().setPriority(8);
    
        InnerPriorityThread t = new InnerPriorityThread();
      System.out.println(t.getPriority());
    }
}

//IN THE ABOVE CODE IS TO GETPRIORITY AND SETPRIORITY
//THE DEFAULT PRIORITY OF THREAD IS 5 
