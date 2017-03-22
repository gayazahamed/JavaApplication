package corejava;

import java.util.ArrayList;

public class OutofMem {
    public OutofMem() {
        super();
    }
//-Xms32m -Xmx64m -verbose:gc
    ArrayList ar = new ArrayList();


    public static void main(String[] args) {
        int mb = 1024*1024;
        /* This will return Long.MAX_VALUE if there is no preset limit */
        long maxMemory = Runtime.getRuntime().maxMemory();
        /* Maximum amount of memory the JVM will attempt to use */
        System.out.println("Maximum memory (bytes): " +
                           (maxMemory == Long.MAX_VALUE ? "no limit" :
                            maxMemory));

        /* Total memory currently in use by the JVM */
        System.out.println("Total memory (bytes): " +
                           Runtime.getRuntime().totalMemory());
        System.out.println("Free memory (bytes): "+
                           Runtime.getRuntime().freeMemory());
        System.out.println("------------------------------------");
        
        System.out.println("Maximum memory (mb): " +
                           (maxMemory == Long.MAX_VALUE ? "no limit" :
                            maxMemory/mb));

        /* Total memory currently in use by the JVM */
        System.out.println("Total memory (mb): " +
                           Runtime.getRuntime().totalMemory()/mb);
        System.out.println("Free memory (mb): "+
                           Runtime.getRuntime().freeMemory()/mb);
        OutofMem om = new OutofMem();
        try {
            om.generateOOM();
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
       
    }


    public void generateOOM() throws Exception {
        int iteratorValue = 20;
        System.out.println("\n=================> OOM test started..\n");
        for (int outerIterator = 1; outerIterator < 20; outerIterator++) {
            System.out.println("Iteration " + outerIterator + " Free Mem: " +
                               Runtime.getRuntime().freeMemory());
            int loop1 = 2;
            int[] memoryFillIntVar = new int[iteratorValue];
            // feel memoryFillIntVar array in loop..
            do {
                memoryFillIntVar[loop1] = 0;
                loop1--;
            } while (loop1 > 0);
            iteratorValue = iteratorValue * 5;
            System.out.println("\nRequired Memory for next loop: " +
                               iteratorValue);
            Thread.sleep(3000);
        }
    }
}
