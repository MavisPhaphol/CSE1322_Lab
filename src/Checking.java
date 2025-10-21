//For Lab4
public class Checking extends Account{
    //Constructor
    @Override
    public void setAccountBalance(double accountBalance){
        super.setAccountBalance(accountBalance);
    }
    //Modifying Withdrawal
    @Override
    public double withdraw(double money){
        if (money>getAccountBalance()){
            System.out.println("Charging an overdraft fee of $20 because account is below $0");
            double newBalance=getAccountBalance()-20;
            setAccountBalance(newBalance);
        }
        return super.withdraw(money);
    }
}
