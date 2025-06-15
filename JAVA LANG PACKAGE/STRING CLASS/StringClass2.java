public class StringClass2 {
    public static void main(String[] args) {
        String s = new String("This line will create a new object in heap memory.");
        s.concat(" This will not be assigned ");
        s = s.concat(" And String is immutable");
        System.out.println(s); 
    }
}

//THE OUT PUT WILL BE THE FIRST AND 3RD LINE BECAUSE IF WE WANT TO DO ANY CHANGES TO THE PRESENT OBJECT
// A NEW OBJECT WILL BE CREATED WITH THOSE CHANGES  
// THE SECOND LINE WILL BE CREATE AND NOT USED BECAUSE IT IS NOT ASSIGNED ANY VALUE