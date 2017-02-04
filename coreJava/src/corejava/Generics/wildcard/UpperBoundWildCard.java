package corejava.Generics.wildcard;

import java.util.Arrays;
import java.util.List;

public class UpperBoundWildCard {
    public static void main(String[] args) {
//        List<Byte> bi = Arrays.asList(1, 1);
//        System.out.println("sum = " + sumOfList(bi));
//
//        List<Short> sh = Arrays.asList(1, 2);
//        System.out.println("sum = " + sumOfList(sh));

        List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("sum = " + sumOfList(li));


        List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
        System.out.println("sum = " + sumOfList(ld));
    }


    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return s;
    }

}
