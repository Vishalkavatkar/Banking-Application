package bankApplication;

public class SavingsAccount {
	//static variable annual interest rate set by bank
	public static double annualInterestRate;
	private double savingsBalance;
	
	
	public SavingsAccount() {
	annualInterestRate = 0.0;
	savingsBalance = 0.0;
	}
	/**
	 * 
	 * @param intRate passing this value to annual interest rate
	 * @param savBal passing this to savings balance 
	 */
	public SavingsAccount(double intRate, double savBal) {
		annualInterestRate = intRate;
		savingsBalance = savBal;
		}
	
	/**
	 * calculating monthly interest using formula savingsBalance*annualInterestRate/ 12
	 * @return annual interest rate
	 */
	
	public double calculateMonthlyInterestRate() {
		double intRate = (savingsBalance * annualInterestRate) / 12;
		savingsBalance = savingsBalance + intRate;
		return intRate;
	}
	
	/**
	 * creating static method modified interest rate
	 * @param newInterestRate assigning this to annual interest rate
	 */
	public static void modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	
	//setting savingsbalance
	public void setSavingsBalance(double newBal) {
		savingsBalance = newBal;
	}
	
	//getting savings balance
	public double getSavingsBalance() {
		return savingsBalance;
	
	}
	

}	