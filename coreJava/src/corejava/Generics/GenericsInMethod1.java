package corejava.Generics;

public class GenericsInMethod1 {
    public GenericsInMethod1() {
        super();
    }
    //after static we have to put this <K, V>

    public static <K, V> boolean compare(BoxPair<K, V> p1, BoxPair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
            p1.getValue().equals(p2.getValue());
    }
    
    public static void main(String[] args) {
        BoxPair<Integer, String> p1 = new OrderedPair<>(1, "apple");
        BoxPair<Integer, String> p2 = new OrderedPair<>(2, "pear");
        boolean same = GenericsInMethod1.<Integer, String>compare(p1, p2);
        System.out.println(same);
    }
}
