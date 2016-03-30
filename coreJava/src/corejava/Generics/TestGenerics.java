package corejava.Generics;

public class TestGenerics {
    public TestGenerics() {
        super();
    }
    //test Box
    //    public static void main(String[] args) {
    //        Box<String> box = new Box<String>();
    //        box.set("Gayaz");
    //        System.out.println(box.get());
    //
    //        Box<Integer> box2 = new Box<Integer>();
    //        box2.set(2);
    //        System.out.println(box2.get());
    //    }


    //Test Pairs
    //    public static void main(String[] args) {
    //        BoxPair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
    //        System.out.println(p1.getKey());
    //        System.out.println(p1.getValue());
    //        BoxPair<String, String>  p2 = new OrderedPair<String, String>("hello", "world");
    //        System.out.println(p2.getKey());
    //        System.out.println(p2.getValue());
    //    }


    //GenericsInMethod1
    //    public static void main(String[] args) {
    //    BoxPair<Integer, String> p1 = new OrderedPair<>(1, "apple");
    //    BoxPair<Integer, String> p2 = new OrderedPair<>(2, "pear");
    //    boolean same = GenericsInMethod1.<Integer, String>compare(p1, p2);
    //    System.out.println(same);
    //    }


    //Bounded Type Parameters

    //    public static void main(String[] args) {
    //        NaturalNumber<Integer> integerBox = new NaturalNumber<Integer>(10);
    //        //causes error
    //        // NaturalNumber<String> string = new NaturalNumber<String>(10);
    //        //integerBox.set(new Integer(10));
    //    }


    public static void main(String[] args) {
        TestGenerics testGenerics = new TestGenerics();
        Integer[] intArry = new Integer[10];
        for (int i = 0; i < intArry.length; i++) {
            intArry[i] = i;
            System.out.println(i);
        }
        System.out.println("-----------------");
        System.out.println("numbers that are greater than 5 in array : " +
                           testGenerics.countGreaterThan(intArry, 5));

    }


    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray,
                                                                 T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }

}
