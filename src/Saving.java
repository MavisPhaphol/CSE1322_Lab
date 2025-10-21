//For Lab4
public class Saving extends Account {
    private int count;
    //Constructor
    @Override
    public void setAccountBalance(double accountBalance){
        super.setAccountBalance(accountBalance);
    }
    //Withdrawal
    @Override
    public double withdraw(double money){
        if (getAccountBalance()<500){
            System.out.println("Charging a fee of $10 because you are below $500");
            double newBalance=getAccountBalance()-10;
            setAccountBalance(newBalance);
        }
        return super.withdraw(money);
    }
    //Deposit
    @Override
    public double deposit(double money){
        count++;
        System.out.println("This is deposit "+count+" to this account");
        if (count>=6){
            System.out.println("Charging a fee of $10");
            double newBalance=getAccountBalance()-10;
            setAccountBalance(newBalance);
        }
        return super.deposit(money);
    }
    //Method Interest
    public double interest(){
        double annualRate=0.015;
        double newBalance=getAccountBalance()*annualRate;
        System.out.println("Customer earned "+newBalance+" in interest");
        double addedNew=getAccountBalance()+newBalance;
        setAccountBalance(addedNew);
        return getAccountBalance();
    }
}
