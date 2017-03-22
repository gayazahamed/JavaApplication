package corejava;

public class ReflectionObj {
    public ReflectionObj() {
        super();
    }

    private String str;

    public ReflectionObj(String st, String st1) {
        super();
        System.out.println(st);
        System.out.println(st1);

    }

    public String testMe() {
        System.out.println("test me called");

        System.out.println("str val : " + str);
        return "testeed";
    }
    
    private String privateMet() {
        System.out.println("test me called");

        System.out.println("str val : " + str);
        return "testeed";
    }
}
