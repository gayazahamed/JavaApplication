package corejava.Generics.wildcard;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildCard {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String> ls = Arrays.asList("one", "two", "three", null);
        //        printList1(li);
        //        printList1(ls);

        printList2(li);
        printList2(ls);
    }
    // no primitieves

    public static void printList1(List<Object> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }
    // here you can pass null primitives and object

    public static void printList2(List<?> list) {
        for (Object elem : list)
            System.out.print(elem + " ");
        System.out.println();
    }


}
