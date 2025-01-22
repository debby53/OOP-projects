package ONLINE_SHOPPING;

import java.util.regex.Pattern;

class InvalidLoginException extends Exception{
    public InvalidLoginException (String message){
        super(message);
    }

}
class InvalidCartException extends Exception{
    public InvalidCartException(String message){
        super(message);
    }
}
class InvalidPaymentException extends Exception{
    public InvalidPaymentException(String message){
        super(message);
    }
}
class InvalidRegistrationException extends Exception{
    public InvalidRegistrationException (String message){
        super(message);
    }
}

public class User {
    private int userId;
    private String name;
    private String email;
    private  String password;

    public User(int userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void register(int userId,String name,String email,String password)throws InvalidRegistrationException{
        String emailRegex = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        if(!Pattern.matches(emailRegex,email))throw new InvalidRegistrationException("follow email format");
        if(userId<0)throw new InvalidRegistrationException("id must be above 0");
        if(password.matches("^(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}$"))throw new InvalidRegistrationException("follow password format");
        if(name.isEmpty())throw new InvalidRegistrationException("name cannot be empty");
        this.email=email;
        this.name=name;
        this.password=password;
        this.userId=userId;
    }
    public void login(String email,String password)throws InvalidLoginException{
        String emailRegex = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        if(!Pattern.matches(emailRegex,email) ||(!this.password.matches("^(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}$")) ){
            throw new InvalidLoginException("email or password is incorrect");

        }
        System.out.println("login successfully");
    }
}
