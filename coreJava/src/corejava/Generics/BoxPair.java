package corejava.Generics;

//K - Key
// V - Value
public interface BoxPair<K, V> {
    public K getKey();

    public V getValue();
}

//E - Element (used extensively by the Java Collections Framework)
// K - Key
// N - Number
// T - Type
// V - Value
// S,U,V etc. - 2nd, 3rd, 4th types