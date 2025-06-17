public class SepArea {
    public static void main(String[] args) {
        String s = new String("Heap area");
        String s1 = new String("Heap area");
        System.out.println(s == s1);
        String s2 = "Heap area";
        System.out.println(s== s2);
        String s3 = "Heap area";
        System.out.println(s2==s3);
    }
}
