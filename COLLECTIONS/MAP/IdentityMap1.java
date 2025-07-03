import java.util.*;
import java.util.IdentityHashMap;


public class IdentityMap1 {
    public static void main(String[] args) {
        IdentityHashMap<String,Integer> h = new IdentityHashMap<>();
        String s1 = new String("A");
        String s2 = new String("A");
        h.put(s1, 98);
        h.put(s2, 97);
        System.out.println(h);

    }  
}
//IdentityHashmap is a child of map 
// 