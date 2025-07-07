import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>(); 
        l.add("Shirisha");
        l.add("Revathi");
        l.add("Anjali");
        l.add("Anusha");
        l.set(2, "Varshini");
        l.addFirst("Snehitha");
        System.out.println(l);
    }
}
