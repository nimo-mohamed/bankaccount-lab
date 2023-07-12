public class BankAccount {

    private String firstName;
    private String lastName;
    private int dateOfBirth;
    private int accountNumber;

    private int balance;

    public BankAccount(){
        this.firstName = "";
        this.lastName = "";
//        this.dateOfBirth = "";
//        this.accountNumber = "";
//        this.balance = "";
    }

    public String getFirstName(String firstName){
        return firstName;
    }

    public String getLastName(String lastName){
        return lastName;
    }

    public String getDataOfBirth(String dataOfBirth){
        return dataOfBirth;
    }

    public String getAccountNumber(String accountNumber){
        return accountNumber;
    }

    public String getBalance(String balance){
        return balance;
    }



}
