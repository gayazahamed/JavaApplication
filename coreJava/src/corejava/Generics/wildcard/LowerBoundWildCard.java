package corejava.Generics.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerBoundWildCard {
    public static void main(String[] args) {


        List<Number> list = new ArrayList<Number>();//Arrays.asList(1, 2, 3, 4, 5, 6);
        addNumbers(list);
        printList(list);
    }


    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
           // System.out.println(i);
        }
    }
    
    public static void printList(List<? super Integer> list) {
        for (Object i : list) {
            System.out.println(i);
        }
    }
}
