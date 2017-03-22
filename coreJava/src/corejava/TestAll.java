package corejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestAll {
    public TestAll() {
        super();
    }
    
    public static void main(String[] args) {
        String str = null;
        String str2 = "aaa";
//        if(str.equalsIgnoreCase("a")) {
//            System.out.println("hi");
//        }
//       
//        if("a".equalsIgnoreCase(str)) {
//            System.out.println("hi");
//        }
        
        boolean b = str.equalsIgnoreCase(str2);
        //boolean b = str2.equalsIgnoreCase(str);
        System.out.println(b);
        
        System.out.println("kkkkkkkkkk");
    }

    public static void main5(String[] args) {
        // initializing unsorted int array
        int iArr[] = { 2, 1, 9, 88, 6, 4 };
        //int iArr[] = { 2, 1, 9, 6, 4 };
        // let us print all the elements available in list
        for (int number : iArr) {
            System.out.println("Number = " + number);
        }

        // sorting array
        //Arrays.sort(iArr);
        int temp = 0;
        for (int i = 0; i < iArr.length; i++) {
            for (int k = 0; k < iArr.length; k++) {
                if (iArr[k] > iArr[i]) {
                    temp = iArr[i];
                    iArr[i] = iArr[k];
                    iArr[k] = temp;
                }
            }
        }


        // let us print all the elements available in list
        System.out.println("The sorted int array is:");
        for (int number : iArr) {
            System.out.println("Number = " + number);
        }

    }
}
