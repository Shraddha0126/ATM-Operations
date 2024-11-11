package com.codegnan;

import com.codegnan.customExceptions.InsufficientBalanceException;
import com.codegnan.customExceptions.InsufficientMachineBalanceException;
import com.codegnan.customExceptions.InvalidAmountException;
import com.codegnan.customExceptions.NotAOperatorException;

public interface IATMService {
	String getUserName = null;
	//to get the user type.whether the user is operator or normal user
	public abstract String getUserType() throws NotAOperatorException;
	//1.will throw InvalidAmountException is the amount is not a valid denomination.
	//2.will throw InsufficientBalanceException if the customer has insufficient amount in her/his account.
	//3.will throw InsufficientMachineBalance Exception if the machine has insufficient cash.
	public abstract double withdrawAmount(double withAmount) 
			throws InvalidAmountException,InsufficientBalanceException,InsufficientMachineBalanceException;
	
	public abstract void depositAmount(double deptAmount) throws InvalidAmountException;
	//to check balance
	public abstract double checkAccountBalance();
	//to change the pin number
	public abstract void changePinNumber(int pinNumber);
	
	//get pin number
	public abstract int getPinNumber();
	
	//to decrease to number of chances while entening the wrong pin number
	public abstract  String getUserName();
	
	//to decrease no of chances while entering the pin
	public abstract void decreaseChances();
	
	//to get the chances of chances pin number
	public abstract int getChances();
	
	//to reset the pin number chances by bank operatoe.
	public abstract void resetPinChances();
	public abstract void generateMiniStatement();
	
	

}
