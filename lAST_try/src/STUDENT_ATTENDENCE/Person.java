package STUDENT_ATTENDENCE;

import java.util.regex.Pattern;

public class Person {
    private String name;
    private String email;
    private int id;

    public Person(String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String emailRegex = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        if(Pattern.matches(emailRegex,email)) {
            this.email = email;
        }else{
            System.out.println("email must follow normal email format");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(String.valueOf(id).length()==6) {
            this.id = id;
        }else{
            System.out.println("id must equal to 6 digits ");
        }
    }
}
