import java.util.concurrent.*;
import java.util.*;


public class ConcurrentHashMap2 extends Thread {
    static ConcurrentHashMap<Integer,String> m = new ConcurrentHashMap<>();
    public void run(){
       try {
        Thread.sleep(2000);
       } catch (InterruptedException e) {}
          System.out.println("child thread Updating map");
          m.put(4, "d");
       
    }
   public static void main(String[] args)  throws InterruptedException{
    m.put(1, "a");
    m.put(2, "b");
    m.put(3, "c");

    ConcurrentHashMap2 h = new ConcurrentHashMap2();
    h.start();
    
    Iterator<Integer> i = m.keySet().iterator();
    while (i.hasNext()) {
        Integer i1 = (Integer)i.next();
        System.out.println("Main thread and current entry  " + i1 + "..." + m.get(i1));
        Thread.sleep(3000);
    }
   System.out.println(m);

   }
}
