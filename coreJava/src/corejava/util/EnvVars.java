package corejava.util;

public class EnvVars {
    public EnvVars() {
        super();
    }
    
    public static void main(String[] args) {
        System.out.println(System.getenv("JAVA_HOME"));
        
        
        System.out.println(System.getenv("ORACLE_HOME"));
    }
}
