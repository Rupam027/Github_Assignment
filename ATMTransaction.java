package com.java.assignment;

class UnsupportedTransactionException extends Exception{
	
	public String toString() {

		return "INVALID TRANSACTION" ;
	
	}
	
}



public class ATMTransaction {
	
	public void execute(String transactionType){
		
		try {
			switch(transactionType) {
			case "credit" : 
					System.out.println("Credit from ATM");
					break ;
			case "debit" : 
				System.out.println("Debit from ATM");
				break ;
			case "balanceInquiry" : 
				System.out.println("Chcking Balance from ATM");
				break ;
			case "pinChange" : 
				System.out.println("Change User Pin from ATM");
				break ;
			default : 
				throw new UnsupportedTransactionException() ; 
			}
		}
		catch(UnsupportedTransactionException e){
			System.out.println(e);
			
		}
		finally {
			System.out.print("Closing ATM");
		}
			
	}

}
