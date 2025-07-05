import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConurrentHashMap1 {
    public static void main(String[] args) {
           ConcurrentHashMap<Integer,String> h = new ConcurrentHashMap<>(); 
    h.put(10,"A");
    h.put(20, "B");
    h.put(30, "C");
    h.put(40, "D");
       System.out.println(h);
       Iterator<Integer> itr = h.keySet().iterator();
       while (itr.hasNext()) {
            Integer key = itr.next();
            System.out.println("Key: " + key + ", Value: " + h.get(key));
     
       }
    }
 
}

//if you what to print kay valu pairs one by one then you shoul go for iterater