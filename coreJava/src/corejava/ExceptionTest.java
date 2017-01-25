package corejava;

import java.io.FileInputStream;
import java.io.*;

public class ExceptionTest {
    static {
    int num = Integer.parseInt("sd", 16);
    }
    int returnVal = 11;

    private int getInt() {
        try {
            String[] students = { "Harry", "Paul" };
            System.out.println(students[5]);
        } catch (Exception e) {
            System.out.println("About to return :" + returnVal);
            return returnVal;
        } finally {
            returnVal += 10;
            System.out.println("Return value is now :" + returnVal);
        }
        return returnVal;
    }

    private StringBuilder getStringBuilder() {
        StringBuilder returnVal = new StringBuilder("10");
        try {
            String[] students = { "Harry", "Paul" };
            System.out.println(students[5]);
        } catch (Exception e) {
            System.out.println("About to return :" + returnVal);
            return returnVal;
        } finally {
            returnVal.append("10");
            System.out.println("Return value is now :" + returnVal);
        }
        return returnVal;
    }


    public static void main2(String[] args) {
        ExceptionTest var = new ExceptionTest();
        System.out.println("In Main:" + var.getInt());

        System.out.println("In Main:" + var.getStringBuilder());
    }


    FileInputStream soccer;

    public void myMethod()  throws FileNotFoundException {

        try {
            soccer = new FileInputStream("soccer.txt");
        } catch (FileNotFoundException fnfe) {
            throw fnfe;
        }
    }
    
    static long count = 0;
    public static void main(String args[]) {
    try {
    myMethod2();
    }
    catch (StackOverflowError s) {
        System.out.println(count);
    for (int i=0; i<2; ++i)
    System.out.println(i);
    }
    }
    public static void myMethod2() {
        count ++;
    myMethod2();
    }

}
