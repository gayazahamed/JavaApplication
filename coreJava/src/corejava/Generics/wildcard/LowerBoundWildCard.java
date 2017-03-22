package corejava.Generics.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerBoundWildCard {
    public static void main(String[] args) {
        List<Number> list =
            new ArrayList<>(); //Arrays.asList(1, 2, 3, 4, 5, 6);
        addNumbers(list);
        printList(list);

        Number n = new Byte("1");
        testExtends(n);
        Number d = new Double(1.0);
        testExtends(d);
        Runtime runtime = Runtime.getRuntime();
        
         
    }


    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 3; i++) {
            list.add(i);
            // System.out.println(i);
        }
        list.add(898989888);
        //list.add(new Byte("9"));
    }

    public static void printList(List<? super Integer> list) {
        for (Object i : list) {
            System.out.println(i);
        }
    }

    public static <T> void newMethod(List<T> list) {
        System.out.println();
    }

    public static <T extends Number> void testExtends(T item) {
        System.out.println(item);
    }


}
