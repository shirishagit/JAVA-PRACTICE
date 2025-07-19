import java.util.*;
import java.util.stream.Collectors;


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
        List<Integer> r = ai.stream()
                    .map(i -> i + 2)
                    .collect(Collectors.toList());
                    System.out.println(r);
    }
    
}
