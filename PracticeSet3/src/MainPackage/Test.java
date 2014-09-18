package MainPackage;

import java.io.*;

public class Test {
	
	public static void main(String [] args) throws InsufficientFundsException{
	Account A= new Account(1122, 20000);
	A.withdraw(2500);
	A.deposit(3000);
	java.util.Date dateCreated = A.dateCreated();
	
	System.out.println(A.getBalance());
	System.out.println(A.getMonthlyInterestRate());
	System.out.println(dateCreated);
	
	A.withdraw(30000);
	System.out.println(A.getBalance());
	}
	

}
