import java.util.*;
import java.util.stream.Collector;


public class StreamInterf {
    public static void main(String[] args) {
        ArrayList<Integer> ai = new ArrayList<Integer>();
        ai.add(1);
        ai.add(4);
        ai.add(8);
        ai.add(12);
        ai.add(44);
        ai.add(6);
        ai.add(9);
        System.out.println(ai);
        ArrayList<Integer> r =  ai.stream().map((n)->n+2).count();
    }
    
}
