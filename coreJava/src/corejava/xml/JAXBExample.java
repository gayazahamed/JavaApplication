package corejava.xml;

import java.io.File;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class JAXBExample {

    private static final String FILE_NAME = "jaxb-emp100.xml";
    private static final String OUTPUT_FILE_NAME = "jaxb-emp-out.xml";
    
    
    
    public static void main(String[] args) {


        System.out.println("convet xml to object");
        Employee empFromFile = jaxbXMLToObject();
        System.out.println(empFromFile.toString());
        System.out.println();
        System.out.println("end main");
    }

    //object to xml

    public static void main5(String[] args) {
        Employee emp = new Employee();
        emp.setId(1);
        emp.setAge(25);
        emp.setName("Gayaz");
        emp.setGender("Male");
        emp.setRole("Developer10");
        emp.setPassword("sensitive");
        System.out.println("convet object to xml");

        jaxbObjectToXML(emp);
        System.out.println();
    }

    private static Employee jaxbXMLToObject() {
        try {
            JAXBContext context = JAXBContext.newInstance(Employee.class);
            Unmarshaller un = context.createUnmarshaller();
            Employee emp3 = (Employee)un.unmarshal(new File(FILE_NAME));
            return emp3;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }


    private static void jaxbObjectToXML(Employee emp) {

        try {
            JAXBContext context = JAXBContext.newInstance(Employee.class);
            Marshaller m = context.createMarshaller();
            //for pretty-print XML in JAXB
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // Write to System.out for debugging
            // m.marshal(emp, System.out);

            // Write to File
            m.marshal(emp, new File(OUTPUT_FILE_NAME));
            System.out.println(asString(context, emp));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


    public static String asString(JAXBContext pContext,
                                  Object pObject) throws JAXBException {

        java.io.StringWriter sw = new StringWriter();

        Marshaller marshaller = pContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        marshaller.marshal(pObject, sw);

        return sw.toString();
    }

}
