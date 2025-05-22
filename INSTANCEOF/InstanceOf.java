public class InstanceOf {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t instanceof Runnable);
        System.out.println(t instanceof Object);
        
    }
}

//INSTANCEOF IS AN OPERATOR IN JAVA
//THIS IS USED TO CHECK WHETHER  THE GIVEN OBJECT IS OF PATICULAR TYPE OR NOT
//THIS METHOD IS ONLY USEFULL IF WE KNOWN THE TYPE AT THE BEGINNING ONLY 
