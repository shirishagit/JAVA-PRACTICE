import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(10);
        ar.add(50);
        ar.add(88);
        ar.add(44);
        ar.add(null);

        System.out.println(ar);
        System.out.println(ar.size());
        System.out.println(ar.indexOf(44));
    }
}


