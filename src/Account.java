//For Lab4
public class Account {
    private int accountNumber;
    private double accountBalance;
    public static int nextID=10001;
    //Constructor
    public void openAccount(){
        accountNumber=nextID;
        nextID++;
    }
    //Overload Constructor
    public void openAccount(double money){
        accountNumber=nextID;
        accountBalance=money;
        nextID++;
    }
    //Getter
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    //Setter
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    //Method
    public double withdraw(double money){
        accountBalance-=money;
        return accountBalance;
    }
    public double deposit(double money){
        accountBalance+=money;
        return accountBalance;
    }
}
