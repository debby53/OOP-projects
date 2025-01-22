package fggg;
class RegistrationException extends Exception {
    public RegistrationException(String message) {
        super(message);
    }
}
    class  CartException extends Exception{
        public  CartException(String message){
            super(message);
        }
    }
    class PaymentException extends Exception{
    public PaymentException(String message){
        super(message);
    }
    }



public class User {
    private int userId;
    protected String name;
    private String email;
    private String password;

    public User(int userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public boolean login(String email,String password){
        return this.email.equals(email) && this.password.equals(password);
    }
    private boolean isValidEmail(String email){
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
    }
    private boolean isValidPassword(String password) {
        return password.matches("^(?=.*[0-9])(?=.*[!@#$%^&*])(?=.*[A-Za-z]).{8,}$");
    }
}
