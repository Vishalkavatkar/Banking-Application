package bankApplication;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount saver1 = new SavingsAccount(); //saver one
		SavingsAccount saver2 = new SavingsAccount(); //saver 2
		
		saver1.setSavingsBalance(2000.00); //setting saving balance of saver1 to 2000
		saver2.setSavingsBalance(3000.00); //setting saving balance of saver2 to 3000
		
		//modifying interest rate to 4% = 0.04
		System.out.println("....Balance for this month....");
		SavingsAccount.modifyInterestRate(0.04);
		
		//calculating monthly interest for saver 1 and 2
		saver1.calculateMonthlyInterestRate();
		saver2.calculateMonthlyInterestRate();
		
		//output
		System.out.println("new balance for saver 1 with 4% interest rate is: "+saver1.getSavingsBalance());
		System.out.println("new balance for saver 2 with 4% interest rate is: "+saver2.getSavingsBalance());
		
		
		System.out.println("....Balance for next month....");
		//modifying interest rate to 5% =0.05		
		SavingsAccount.modifyInterestRate(0.05);
		
		//calculating monthly interest for saver 1 and 2
		saver1.calculateMonthlyInterestRate();
		saver2.calculateMonthlyInterestRate();
		
		//output
		System.out.println("new balance for saver 1 with 5% interest rate is: "+saver1.getSavingsBalance());
		System.out.println("new balance for saver 2 with 5% interest rate is: "+saver2.getSavingsBalance());
		
		
		
	}

}
