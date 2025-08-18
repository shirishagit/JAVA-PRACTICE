

public class CountWords {
    public static void main(String[] args) {
        String Words = "Shirisha Revathi Anusha Snehitha";
        int Count = Words.split("\\s").length;
        System.out.println(Count); 
        System.out.println("Here is the count");   
    }
}
