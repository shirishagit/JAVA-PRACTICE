class popcorn{
    public void taste(){
        System.out.println("salty");
    }
}

public class AnonymousClass1 {
    public static void main(String[] args) {
        popcorn p = new popcorn(){
           public void taste(){
            System.out.println("Spicy");
           }
        };
        p.taste();
        popcorn p1 = new popcorn();
        p1.taste();
    }
}


//THE ABOVE CLASS IS ANONYMOUS CLASS 
//THIS IS ANONYMOUS INNER CLASS THAT EXTENDS CLASS
//THE CLASS THAT DOES NOT HAVE NAME AND USED ONLY FOR INSTANCE PURPOSE (ONE TIME USAGE)
