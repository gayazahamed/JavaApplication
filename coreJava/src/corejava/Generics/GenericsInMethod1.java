package corejava.Generics;

public class GenericsInMethod1 {
    public GenericsInMethod1() {
        super();
    }
    //after static we have to put this <K, V>


    //1.
    //    public static <K, V> boolean compare(BoxPair<K, V> p1, BoxPair<K, V> p2) {
    //        return p1.getKey().equals(p2.getKey()) &&
    //            p1.getValue().equals(p2.getValue());
    //    }
    //
    //    public static void main(String[] args) {
    //        BoxPair<Integer, String> p1 = new OrderedPair<>(1, "apple");
    //        BoxPair<Integer, String> p2 = new OrderedPair<>(2, "pear");
    //        boolean same = GenericsInMethod1.<Integer, String>compare(p1, p2);
    //        System.out.println(same);
    //    }


    //2.


    public static <E> void printArray(E[] inputArray) {
        // Display array elements
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("Array integerArray contains:");
        printArray(intArray); // pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray); // pass a Double array

        System.out.println("\nArray characterArray contains:");
        printArray(charArray); // pass a Character array
    }
}
