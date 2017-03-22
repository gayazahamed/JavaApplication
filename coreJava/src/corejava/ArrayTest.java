package corejava;

import java.util.Arrays;

public class ArrayTest {
    public ArrayTest() {
        super();
    }

    public static void main(String[] args) {
        int[] iArr = new int[100];
        Arrays.fill(iArr, 10);

        for (int number : iArr) {
            System.out.println("Number = " + number);
        }
    }

   

}
