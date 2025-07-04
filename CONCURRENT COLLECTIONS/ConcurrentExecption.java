import java.util.*;
import java.util.Iterator;

public class ConcurrentExecption {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("S");
        a.add("I");
        a.add("R");
        a.add("I");
        Iterator<String> itr = a.iterator();
        while(itr.hasNext()){
        String s = (String)itr.next();
        System.out.println(s);
        a.add("S");
        }
    }
}


//In the treditional Collection objects like (arraylist and hashmap) can be accessed by multipul thread simultenously and there
// might be data consistency problem and hence there are not thread safe
//in the above code inplemments arraylist object but at a time only one thread can access the object
//if there another thread trying to update the object then we will get ConcurrentModificationExecption