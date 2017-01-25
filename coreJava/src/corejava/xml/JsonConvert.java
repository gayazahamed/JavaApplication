package corejava.xml;

import com.google.gson.Gson;


import java.util.ArrayList;
import java.util.List;


public class JsonConvert {
    public JsonConvert() {
        super();
    }


    public static void main(String[] args) {

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
}
