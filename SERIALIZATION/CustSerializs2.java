
 import java.io.*;

   

class Account1 implements Serializable{
    String Username = "siri";
    transient int PassWord = 191130;
    private static final long serialVersionUID = 1L;
    



public class CustSerializs2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Account1 a = new Account1();
        System.out.println(a.Username + "..." + a.PassWord);
        FileOutputStream fos = new FileOutputStream("CustSerializable.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);
        oos.close();

        FileInputStream fis = new FileInputStream("CustSerializable.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account1 a1 = (Account1)ois.readObject();
        System.out.println(a1.Username + "...." + a1.PassWord);
      
        ois.close();
    }


}
