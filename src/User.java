import java.util.ArrayList;

public class User {
    //First name of the user
    private String firstName;

    //Last name of the user
    private String lastName;

    //ID number of the user
    private String uuid;

    //MD5 hash of the user's pin
    private byte pinHash[];

    //List of accounts for this user
    private ArrayList<Account> accounts;
}