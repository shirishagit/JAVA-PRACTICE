public class SepArea {
    public static void main(String[] args) {
        String s = new String("Heap area and SCP area");  // Created in Heap area
        String s1 = new String("Heap area and SCP area");  //createrd in heap area
        System.out.println(s == s1); // false
        String s2 = "Heap area and SCP area";  //Created in scp
        System.out.println(s== s2); //false
        String s3 = "Heap area and SCP area"; // reused from scp area
        System.out.println(s2==s3); //true
        String s4 = "Heap area" + " and SCP area" ; 
        System.out.println(s3 == s4); //true
        String s5 = "Heap area";  // 
        String s6 = s5 + " and SCP area" ;
        System.out.println(s3 == s6);  // false
        final String s7 = "Heap area";
        String s8 = s7 + " and SCP area";
        System.out.println(s3 == s8); // true
        System.out.println(s5 == s7); //true



    }
}
