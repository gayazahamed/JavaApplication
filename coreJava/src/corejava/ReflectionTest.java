package corejava;

import java.lang.reflect.Field;


public class ReflectionTest {
    public ReflectionTest() {
        super();
    }

    public static void main(String[] args) {
        Object obj = null;
        java.lang.reflect.Method theGetPortTypeMethod = null;
        try {
            obj =
Class.forName("corejava.ReflectionObj").getConstructor(new Class[] { String.class,
                                                                     String.class }).newInstance(new Object[] { "abcd",
                                                                                                                "efgh" });

            Field fff = obj.getClass().getDeclaredField("str");
            fff.setAccessible(true);
            fff.set(obj, "ssssssssss");
            theGetPortTypeMethod =
                    obj.getClass().getDeclaredMethod("privateMet", null);
            theGetPortTypeMethod.setAccessible(true);
            System.out.println(theGetPortTypeMethod.invoke(obj, null));
        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public static void main3(String[] args) {
        Object obj = null;
        java.lang.reflect.Method theGetPortTypeMethod = null;
        try {
            obj =
Class.forName("corejava.ReflectionObj").getConstructor(new Class[] { String.class,
                                                                     String.class }).newInstance(new Object[] { "abcd",
                                                                                                                "efgh" });

            Field fff = obj.getClass().getDeclaredField("str");
            fff.setAccessible(true);
            fff.set(obj, "ssssssssss");
            theGetPortTypeMethod =
                    obj.getClass().getDeclaredMethod("testMe", null);
            System.out.println(theGetPortTypeMethod.invoke(obj, null));
        } catch (Exception e) {

            e.printStackTrace();
        }

    }


    public static void main2(String[] args) {
        Object obj = null;
        java.lang.reflect.Method theGetPortTypeMethod = null;
        try {
            obj =
Class.forName("corejava.ReflectionObj").getConstructor(new Class[] { String.class,
                                                                     String.class }).newInstance(new Object[] { "abcd",
                                                                                                                "efgh" });

            theGetPortTypeMethod =
                    obj.getClass().getDeclaredMethod("testMe", null);
            System.out.println(theGetPortTypeMethod.invoke(obj, null));
        } catch (Exception e) {

            e.printStackTrace();
        }

    }


    public static void main1(String[] args) {
        Object obj = null;
        java.lang.reflect.Method theGetPortTypeMethod = null;
        try {
            obj =
Class.forName("corejava.ReflectionObj").getConstructor().newInstance(new Object[] { });

            theGetPortTypeMethod =
                    obj.getClass().getDeclaredMethod("testMe", null);
            System.out.println(theGetPortTypeMethod.invoke(obj, null));
        } catch (Exception e) {

            e.printStackTrace();
        }

    }
}
