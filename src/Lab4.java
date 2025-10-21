import java.util.*;
//Use Account, Checking, Saving files
public class Lab4 {
    public static void main(String[]args){
        Checking checking=new Checking();
        Saving saving=new Saving();
        Scanner userInput=new Scanner(System.in);
        Account checkAccount=new Account();
        Account savingAccount=new Account();
        int menu=0;
        checkAccount.openAccount();
        savingAccount.openAccount();
        while (menu!=8){
            System.out.println("1. Withdraw from Checking\n2. Withdraw from Savings\n3. Deposit to Checking\n4. Deposit to Savings\n5. Balance of Checking\n6. Balance of Savings\n7. Award Interest to Savings now\n8. Quit");
            menu=userInput.nextInt();
            if(menu==1){//Withdraw Checking
                System.out.println("How much would you like to withdraw from Checking?");
                double withdrawMoney=userInput.nextDouble();
                saving.withdraw(withdrawMoney);
            }
            else if(menu==2){//Withdraw Saving
                System.out.println("How much would you like to withdraw from Savings? ");
                double withdrawMoney=userInput.nextDouble();
                saving.withdraw(withdrawMoney);
            }
            else if(menu==3){//Deposit Checking
                System.out.println("How much would you like to deposit into Checking?");
                double depositMoney=userInput.nextDouble();
                checking.deposit(depositMoney);
            }
            else if(menu==4){//Deposit Saving
                System.out.println("How much would you like to deposit into Savings?");
                double depositMoney=userInput.nextDouble();
                saving.deposit(depositMoney);
            }
            else if(menu==5){//Balance Checking
                int number=checking.getAccountNumber();
                double balance= checking.getAccountBalance();
                System.out.println("Your balance for checking "+number+" is "+balance);
            }
            else if(menu==6){//Balance Saving
                int number=saving.getAccountNumber();
                double balance= saving.getAccountBalance();
                System.out.println("Your balance for saving "+number+" is "+balance);
            }
            else if(menu==7){//Add Interest to Saving
                saving.interest();
            }
        }
    }
}
