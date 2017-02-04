package corejava.programming;

import java.util.Scanner;

public class ReverseNumber {


    public static void main(String[] args) {
        int n, reverse = 0;

        System.out.println("Enter the number to reverse");
        //Scanner in = new Scanner(System.in);
        n = 10907; //in.nextInt();

        while (n >= 1) {
            reverse = reverse * 10 + (n % 10);
            System.out.println(reverse);
            n = n / 10;
        }


        System.out.println("Reverse of entered number is " + reverse);
        
        
        String str ="1000";
        System.out.println(str);
        
        Number nmmm = new Integer(str);
        System.out.println(nmmm);
            
    }
}
