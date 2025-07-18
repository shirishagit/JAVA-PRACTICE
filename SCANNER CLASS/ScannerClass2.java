import java.util.Scanner;

public class ScannerClass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is my First Scanner class");
        int s = sc.nextInt();
        System.out.println("This line peients an Integer " + s);
        sc.close();
    }
}
