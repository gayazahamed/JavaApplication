package corejava;

import java.util.Locale;
import java.util.Calendar;

public class PrintfTest {
    public PrintfTest() {
        super();
    }
    
    
    //printf
    public static void main(String[] args) {
        int intValue = 461012;
        double dblTotal = 12345.6789;
        String stringVal = "sssssss";
        
        //byte, Byte, short, Short, int and Integer, long, and Long.
        System.out.printf("Total is: $%d%n", intValue);
        
        System.out.printf("Total is: $%f%n", dblTotal);
        System.out.printf("Total is: $%s%n", stringVal);
        System.out.printf("Total is: $%d%n", intValue);
        
        
        
        
        
        
        
        
        
        
        
        
//        
//        System.out.printf("Total is: $%,.2f%n", dblTotal);
//        
//        System.out.printf("Total: %-10.2f: ", dblTotal);
//        System.out.println();
//        System.out.printf("% 4d", intValue);
//        System.out.println();
//        System.out.printf("%20.10s\n", stringVal);
//        System.out.println();
//        String s = "Hello World";
//        System.out.printf("The String object %s is at hash code %h%n", s, s);
    }
    
    
    //format
//    public static void main(String[] args) {
//              long n = 461012;
//              System.out.format("%d%n", n);      //  -->  "461012"
//              System.out.format("%08d%n", n);    //  -->  "00461012"
//              System.out.format("%+8d%n", n);    //  -->  " +461012"
//              System.out.format("%,8d%n", n);    // -->  " 461,012"
//              System.out.format("%+,8d%n%n", n); //  -->  "+461,012"
//              
//              double pi = Math.PI;
//
//              System.out.format("%f%n", pi);       // -->  "3.141593"
//              System.out.format("%.3f%n", pi);     // -->  "3.142"
//              System.out.format("%10.3f%n", pi);   // -->  "     3.142"
//              System.out.format("%-10.3f%n", pi);  // -->  "3.142"
//              System.out.format(Locale.FRANCE,
//                                "%-10.4f%n%n", pi); // -->  "3,1416"
//
//              Calendar c = Calendar.getInstance();
//              System.out.format("%tB %te, %tY%n", c, c, c); // -->  "May 29, 2006"
//
//              System.out.format("%tl:%tM %tp%n", c, c, c);  // -->  "2:34 am"
//
//              System.out.format("%tD%n", c);    // -->  "05/29/06"
//    }
    
    
    
    //Converter	Flag	Explanation
    // d	 	A decimal integer.
    // f	 	A float.
    // n	 	A new line character appropriate to the platform running the application. You should always use %n, rather than \n.
    // tB	 	A date & time conversion�locale-specific full name of month.
    // td, te	 	A date & time conversion�2-digit day of month. td has leading zeroes as needed, te does not.
    // ty, tY	 	A date & time conversion�ty = 2-digit year, tY = 4-digit year.
    // tl	 	A date & time conversion�hour in 12-hour clock.
    // tM	 	A date & time conversion�minutes in 2 digits, with leading zeroes as necessary.
    // tp	 	A date & time conversion�locale-specific am/pm (lower case).
    // tm	 	A date & time conversion�months in 2 digits, with leading zeroes as necessary.
    // tD	 	A date & time conversion�date as %tm%td%ty
    //  	08	Eight characters in width, with leading zeroes as necessary.
    //  	+	Includes sign, whether positive or negative.
    //  	,	Includes locale-specific grouping characters.
    //  	-	Left-justified..
    //  	.3	Three places after decimal point.
    //  	10.3	Ten characters in width, right justified, with three places after decimal point.
}
