import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        String[] stg = {"Shirisha" , "Manisha" ,"Ajju" ,"Kruthin" , "Mokshin"};
        Arrays.sort(stg);// This methos will sort the array accoring to alphabetical order
        for (String str : stg) {
            System.out.println(str); 
        }

    }
}
