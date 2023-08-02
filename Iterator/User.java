package Iterator;

public class User {
    protected String firstName;
    protected String lastName;
    private int clientAccNumber;
    private String password;
    private String username;
    private double amount;

    public User(String firstName, String lastName, int clientAccNumber, String password, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.clientAccNumber = clientAccNumber;
        this.password = password;
        this.username = username;
    }

    public double getAmount() {
        return amount;
    }
    public boolean HighProfileUser(){
        if(getAmount()< 20000){
            return false;
        }
        return true;
    }
}
