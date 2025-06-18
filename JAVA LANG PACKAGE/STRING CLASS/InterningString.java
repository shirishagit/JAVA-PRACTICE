public class InterningString {
    public static void main(String[] args) {
        String s = new String("9Sai");
        String s1 = s.intern();
        System.out.println(s == s1); // Fales
        String s2 = "9Sai";
        System.out.println(s1 == s2); // True
    }
}


// We can use Intern() method to get corresponding SCP object reference bu using Heap object