public class BankAccount
{
	String name, acctNo;
	float balance;
	
	BankAccount(String name, String acctNo, float balance)
	{
		this.name = name;
		this.acctNo = acctNo;
		this.balance = balance;
	}
	
	int Deposit(int Deposit)
	{
		return (int) (balance = balance + Deposit);
	}
	
	int Withdraw(int withdrawAmt)
	{
		if(withdrawAmt > balance)
		{
			System.out.println("Insufficient Balance.");
		}
		else
		{
			balance = balance - withdrawAmt;
		}
		return (int) balance;
	}
	
	void getBalance()
	{
		System.out.println("-------------------------------");
		System.out.println("Account Details: ");
		System.out.println("Account Number: " +acctNo);
		System.out.println("Balance: " +balance);
		System.out.println("-------------------------------");
	}
	
	public static void main(String args[])
	{
	}
}

