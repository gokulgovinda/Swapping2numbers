 public class Swapping2Numbers {
    public static void main ( String [ ] args ) {
        int a = 10 , b = 20 ;
        System.out.println("Before swapping values are .. " + a + "  " + b) ;
        // Logic1  using Third variable
        int t = a ;
        a = b ;
        b = t ;
       
//      without using third variable
//      a=a^b;
//      b=a^b;
//      a=a^b;


        System.out.println("After swapping values are .. " + a + "  " + b) ;
 }
 }
