
 import java.io.*;

   

class Account1 implements Serializable{
    String Username = "siri";
    transient String PassWord = "sirisha";
    private static final long serialVersionUID = 1L;
    private void writeObject(ObjectOutputStream os) throws Exception{
        os.defaultWriteObject();
        String epassword = "123" + PassWord;
        os.writeObject(epassword);

    }
    private void readObject(ObjectInputStream oi ) throws Exception {
        oi.defaultReadObject();
    String epassword = (String)oi.readObject();
    PassWord = epassword.substring(3);

    }
   
}



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
