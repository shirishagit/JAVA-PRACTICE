public class StringClass1 {
    public static void main(String[] args) {
        String s = new String("shirisha"); // string is a immutable object
        String s1 = new String("shirisha");
        StringBuffer sb = new StringBuffer("Shirisha"); // stringBuffer is a mutable object
        s.concat(" B.A"); // we cannot insert any value to the created string object
        sb.append(" B.A EPP"); // we can also update and insert another word or value to stringBuffer object
        System.out.println(s); // shirisha
        System.out.println(sb); // Shirisha B.A EPP
        System.out.println(s == s1); // this returns false
        System.out.println(s.equals(s1)); // in string class .equals() method is overriden so it returns true if the
                                          // content is same 
    }
}

// IN THE ABOVE CODE AFTER CONCATINATION TO STRING OBJECT WE CANNOT ACCESS THIS
// VALUE BECAUSE IT IS NOT ASSIGNED ANY VALUE