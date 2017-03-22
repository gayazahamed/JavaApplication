package corejava.xml;

import com.google.gson.Gson;


import java.util.ArrayList;
import java.util.List;

 

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class JsonConvert {
    public JsonConvert() {
        super();
    }

    //java to json

    public static void main3(String[] args) {

        //For testing
        Employee2 emp = new Employee2();
        emp.setId(1);
        emp.setAge(25);
        emp.setName("Gayaz");
        emp.setGender("Male");
        emp.setRole("Developer");
        emp.setPassword("sensitive");
        List<Employee2> listemp = new ArrayList<Employee2>();
        listemp.add(emp);
        listemp.add(emp);
        listemp.add(emp);
        listemp.add(emp);
        Gson gson = new Gson();
        String json = gson.toJson(listemp);
        System.out.println(json);

    }

    //json to java

    public static void main(String[] args) {
        
        ObjectMapper mapper = new ObjectMapper();

        try {

            // Convert JSON string from file to Object
            //                                Employee2 staff = mapper.readValue(new File("D:\\staff.json"), Employee2.class);
            //                                System.out.println(staff);

            // Convert JSON string to Object
      
            String jsonInString = getJson();
            System.out.println(jsonInString);
              //  "{\"name\":\"mkyong\",\"salary\":7500,\"skills\":[\"java\",\"python\"]}";
            Employee2 staff1 = mapper.readValue(jsonInString, Employee2.class);
            System.out.println(staff1);

            //Pretty print
            String prettyStaff1 =
                mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff1);
            System.out.println(prettyStaff1);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            //e.printStackTrace();
        } catch (Throwable e) {
            e.printStackTrace();
        }

    }

    private static String getJson() {
        Employee2 emp = new Employee2();
        emp.setId(1);
        emp.setAge(25);
        emp.setName("Gayaz");
        emp.setGender("Male");
        emp.setRole("Developer");
        emp.setPassword("sensitive");
        List<Employee2> listemp = new ArrayList<Employee2>();
        listemp.add(emp);
        listemp.add(emp);
        listemp.add(emp);
        listemp.add(emp);
        Gson gson = new Gson();
        String json = gson.toJson(emp);
        return json;
    }
}
