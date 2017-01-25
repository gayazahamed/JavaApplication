package corejava.xml;

 
public class Employee2 {

    private int id;

    private String gender;

    private int age;
    private String name;
    private String role;

    private String password;

 
    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }
 
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

 
    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getRole() {
        return role;
    }


    public void setRole(String role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "ID = " + id + " NAME=" + name + " AGE=" + age + " GENDER=" +
            gender + " ROLE=" + role + " PASSWORD=" + password;
    }

}
