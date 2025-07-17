import java.util.Scanner;

public class ScannerClass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is my First Scanner class");
        String s = sc.nextLine();
        System.out.println("Next Line is " + s);
        sc.close();
    }
}
