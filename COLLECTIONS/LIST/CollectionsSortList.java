import java.util.*;

public class CollectionsSortList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(66);
        a.add(30);
        a.add(8);
        a.add(10);
        a.add(44);
        System.out.println(a);//[66,30,8,10,44]
        Collections.sort(a);// the list will be sorted here
        System.out.println(a);//[8,10,30,44,66]
    }
}
//In the collection the list interaface does not contain sort method
//So for sorting os List elements we use Coollections class Sort()method
//if you want customized sorting order the you should pass your compataor object to the sort method