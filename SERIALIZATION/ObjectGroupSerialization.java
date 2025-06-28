import java.io.*;

class Object1 implements Serializable{
    Object2 o = new Object2();
}
class Object2 implements Serializable{
    Object3 b = new Object3();
}
class Object3 implements Serializable{
    int x = 10;
}


public class ObjectGroupSerialization {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("ObjectGraph.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
    }
}
