import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Seriali implements Serializable{
    int x = 10;
    int y = 20;
}

public class Serialization1  {
    public static void main(String[] args) throws Exception {
        Seriali s = new Seriali();
        FileOutputStream fos = new FileOutputStream("Serializable.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);// serialization
        System.out.println(s.x + "..." + s.y);
        oos.close();

        FileInputStream fis = new FileInputStream("Serializable.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Seriali s1 = (Seriali)ois.readObject();
        System.out.println(s1.x + "..." + s.y);
       
        ois.close();
    }
    
}
