import java.util.regex.*;

public class RegularExpression2 {
    public static void main(String[] args) {
       
        Pattern p = Pattern.compile("s");
        Matcher m = p.matcher(args[7]);
        if (m.find() && m.group().equals(args[7])) {
             
            System.out.println(m.start() );
        }else {
            System.out.println("No match found");
        }
    }
}
