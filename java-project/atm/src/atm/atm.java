package atm;

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

class Transaction{
	
	static int current = 100000;
	int transactionCount = 0;
	public int cashWithdraw(int current, int withdrawAmount) throws MyException {
		
		if(transactionCount>5) {
			throw new MyException("Transaction limit reached.");
		}
		if(current >= withdrawAmount && current>10000) {
			System.out.println("Withdrown successfully");
			transactionCount++;
			return current-withdrawAmount;
		}else {
			throw new MyException("Insufficient Balance");
		}
		
	}
}

public class atm {
	
	 
	public static void main(String[] args) {
		Transaction t = new Transaction();
		try {
			int balance = t.cashWithdraw(Transaction.current,1000000);
			System.out.println(balance);
			
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}
}
