package STUDENT_ATTENDANCE;

public class Person1 {
    private String namr;
    private int id;
    private String email;

    public Person1(String namr, int id, String email) {
        this.namr = namr;
        this.id = id;
        this.email = email;
    }

    public String getNamr() {
        return namr;
    }

    public void setNamr(String namr) {
        this.namr = namr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
