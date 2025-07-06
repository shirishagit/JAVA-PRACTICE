import java.util.ArrayList;
import java.util.concurrent.*;

public class CopyOnWriteArrayList1 {
    public static void main(String[] args) {
         CopyOnWriteArrayList<Integer> c = new CopyOnWriteArrayList<>();
          c.add(20);
          c.add(60);
          c.add(40);
          c.addIfAbsent(20);
          System.out.println(c);
          ArrayList<Integer> l = new ArrayList<>();
          l.add(30);
          l.add(30);
          c.addAllAbsent(l);
        System.out.println(c);
    }
   
}
