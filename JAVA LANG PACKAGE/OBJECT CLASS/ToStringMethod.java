public class ToStringMethod {
    /* public String toString(){
     return getClass.getName() + @ + Interger.toHexString(hashcode);    //THIS IS HOW OBJECT CLASS toString() method is called
    } */                                                                     
    public String toString(){
        return "";
    } // HERE WE ARE OVERIDING OBJECT CLASS TOSTRING METHOD WITH CHILED CLASS OBJECT
    public static void main(String[] args) {
        String s = new String("shirisha");
        System.out.println(s.toString());//sHIRIHSA
    }   
}


//IN THE ABOVE CODE IT IS RECOMMENDED TO OVERRIDE OBJECT  CLASS TOSTRING() TO CHILD CLASS TOsTRING METHOD
//AFTER OVERRIDING WE GET THE OUTPUT WHICH WE ARE PASSING TO THE STRING
//IF WE ARE NOT OVERRIDING OBJECT CLASS TOSTRING() METHOD THEN INERNALLY OBJECT CLASS TOSTRING() METHOD WILL BE EXECUTED 