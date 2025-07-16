import java.util.Scanner;
public class Scanner1 {
    public static void main(String[] args) throws Exception {
        Scanner c = new Scanner(System.in);
        System.out.println("Welcome");
        String s = c.nextLine();
        Thread.sleep(3000);
        System.out.println("Hello " + s);
        c.close();

    }
}
