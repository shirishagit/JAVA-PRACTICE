import java.io.*;

public class File1 {
    public static void main(String[] args) throws Exception{
        File f = new File("TextFile.txt");// this line creates a file 
        System.out.println(f.exists());  // this line will check wether the fil
        f.createNewFile(); // this line creates a new file if it is not available
        System.out.println(f.exists()); //this line again check is there any file and returns true
        System.out.println(f.isFile());  // returns true if the specified file is pointing to physical file or not
      

    }
}
