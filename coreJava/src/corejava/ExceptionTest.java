package corejava;

public class ExceptionTest {

    int returnVal = 11;
    int getInt() {
        
        try {
            String[] students = { "Harry", "Paul" };
            System.out.println(students[5]);
        } catch (Exception e) {
            System.out.println("About to return :" + returnVal);
            return returnVal;
        } finally {
            returnVal += 10;
            System.out.println("Return value is now :" + returnVal);
        }
        return returnVal;
    }

    public static void main(String[] args) {
        ExceptionTest var = new ExceptionTest();
        System.out.println("In Main:" + var.getInt());
    }
}
