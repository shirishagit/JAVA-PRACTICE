class InnerPriorityThread {
   
}

public class PriorityThread {
    public static void main(String[] args) {
    
     Thread.currentThread().setPriority(8);
      System.out.println(Thread.currentThread().getPriority()); 
    }
}
