package corejava.Generics;
//Bounded Type Parameters

//Multiple Bounds
//<T extends B1 & B2 & B3>
public class NaturalNumber<T extends Number> {

    private T n;

    public NaturalNumber() {
    }

    public NaturalNumber(T n) {
        this.n = n;
    }

    public boolean isEven() {
        return n.intValue() % 2 == 0;
    }


    public void setN(T n) {
        this.n = n;
    }

    public T getN() {
        return n;
    }
}
