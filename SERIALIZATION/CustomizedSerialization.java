import java.io.*;

class Account implements Serializable{
    String Username = "siri";
    transient int PassWord = 191130;
    private static final long serialVersionUID = 1L;

}

public class CustomizedSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Account a = new Account();
        System.out.println(a.Username + "..." + a.PassWord);
        FileOutputStream fos = new FileOutputStream("CustSerializable.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);
          oos.close();

        FileInputStream fis = new FileInputStream("CustSerializable.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account a1 = (Account)ois.readObject();
        System.out.println(a1.Username + "...." + a1.PassWord);
      
        ois.close();
    }
}
