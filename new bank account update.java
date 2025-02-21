/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/* k BankAccount class banao jo encapsulation ko follow kare. Usme following functionalities honi chahiye:

Private attributes: accountNumber, accountHolderName, balance
Constructor: Values initialize kare
Methods:
deposit(double amount): Balance me paisa add kare
withdraw(double amount): Agar balance sufficient ho to amount deduct kare, warna error message de
getBalance(): Current balance return kare */

class BankAccount{
    
    private long accountNumber;
    private String accountHolderName;
    private double balance;
    BankAccount(long accountNumber,String accountHolderName,double balance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }
    public double deposit(double deposit){
        balance+=deposit;
        return balance;
    }
    public double withdraw(double amount){
        if(amount<=balance && amount>0){
            balance-=amount;
           return amount;
           
        }
        else{
            System.out.println("insufficient balance");
            return 0;
        }
        
    }
    public double getBalance(){
        return balance;
    }
    
    
}
public class Main
{
	public static void main(String[] args) {
		BankAccount user1=new BankAccount(897685544858L,"Adil khan",30000);
		double depositAmount=10000;
		System.out.println("deposit amount is : " + depositAmount); 
		double totalbalance=user1.deposit(depositAmount);
		
		System.out.println("after deposit total balance is :" + totalbalance );
		System.out.println("withdraw amount :"+ user1.withdraw(5000));
		System.out.println("Your available balance is " + user1.getBalance());
	}
}