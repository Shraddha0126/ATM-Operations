package com.codegnan.cards;

import java.util.ArrayList;

import com.codegnan.IATMService;
import com.codegnan.customExceptions.InsufficientBalanceException;
import com.codegnan.customExceptions.InsufficientMachineBalanceException;
import com.codegnan.customExceptions.InvalidAmountException;
import com.codegnan.customExceptions.NotAOperatorException;

public class HDFCDebitCard implements IATMService{
	String name;
	long debitCardNumber;
	double accountBalance;
	int pinNumber;
	ArrayList<String> statement;
	final String type ="user";
	int chances;
	public HDFCDebitCard(String name, long debitCardNumber, double accountBalance, int pinNumber) {
		this.name=name;
		this.debitCardNumber=debitCardNumber;
		this.accountBalance=accountBalance;
		this.pinNumber=pinNumber;
	}

	@Override
	public String getUserType() throws NotAOperatorException {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public double withdrawAmount(double withAmount)
			throws InvalidAmountException, InsufficientBalanceException, InsufficientMachineBalanceException {
		if(withAmount<=0) {
			throw new InvalidAmountException("You entered 0 amount to withdraw. Please enter valid amount.");
		}else if(withAmount%100!=0) {
			throw new InvalidAmountException("Please enter multiples of 100");
		}else if(withAmount<500) {
			throw new InsufficientBalanceException("Please withdraw more than 500");
		}else if(withAmount>accountBalance){
			throw new InsufficientBalanceException("yor dont have sufficient balance to withdraw");
		}else {
			accountBalance=accountBalance-withAmount;
			statement.add("Debited:" +withAmount);
			return withAmount;
	}
	}

	@Override
	public void depositAmount(double deptAmount) throws InvalidAmountException {
		if(deptAmount<=0||deptAmount%100!=0||deptAmount<500) {
			throw new InvalidAmountException("Please deposit multiples of 100 and deposit more than 500");
		}else {
			accountBalance=accountBalance+deptAmount;
			statement.add("Credited:"+deptAmount);
		}
		
	}

	

	@Override
	public void changePinNumber(int pinNumber) {
		
		
	}

	@Override
	public int getPinNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double checkAccountBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void decreaseChances() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getChances() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void resetPinChances() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateMiniStatement() {
		// TODO Auto-generated method stub
		
	}

}
