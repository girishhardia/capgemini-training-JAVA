/*
Banking System (Main Question)

- Create an interface BankOperations with methods deposit(), withdraw(), and checkBalance().

- Create an abstract class Account with encapsulated fields accountNo, holderName, and balance.

- Create SavingsAccount and CurrentAccount classes (extend Account and implement BankOperations).

- Store multiple accounts in an ArrayList<Account>.

Demonstrate runtime polymorphism while performing operations.
	Add features:
	Add a new account
	Remove an account by account number
	Search for an account
	Display all accounts
	Deposit/Withdraw money into/from a chosen account
*/


public class BankingSystem{
	public static void main(String[] args) {
		
	}
}

interface BankingOpretions{
	public boolean deposit();
	public boolean withdraw();
	public double checkBalance();
}

abstract class Account{
	private int accountNo;
	private String accountName;
	private double balance;

    public Account(int accountNo, String accountName, double balance) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

	
}