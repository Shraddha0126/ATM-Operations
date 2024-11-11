package com.codegnan.cards;

import com.codegnan.customExceptions.InsufficientBalanceException;
import com.codegnan.customExceptions.InsufficientMachineBalanceException;
import com.codegnan.customExceptions.InvalidAmountException;
import com.codegnan.customExceptions.NotAOperatorException;
import com.codegnan.IATMService;

public class OperatorCard implements IATMService {

	private int pinNumber;
	private long id;
	private String name;
	private final String type="operator";
	
	public OperatorCard(long id,int pin,String name) {
		id=id;
		pinNumber=pin;
		this.name=name;
	}
	public OperatorCard(long l, String string, double d, int i) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getUserType() throws NotAOperatorException {
		// TODO Auto-generated method stub
		return type;
	}
	@Override
	public double withdrawAmount(double withAmount)
			throws InvalidAmountException, InsufficientBalanceException, InsufficientMachineBalanceException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void depositAmount(double deptAmount) throws InvalidAmountException {
		
		
	}

	@Override
	public double checkAccountBalance(){
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void changePinNumber(int pinNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPinNumber() {
		// TODO Auto-generated method stub
		return pinNumber;
	}

	@Override
	public String getUserName() {
		
		return name;
	}

	@Override
	public void decreaseChances() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getChances(){
		
		return 0;
	}
	@Override
	public void resetPinChances(){
		
		
	}

	@Override
	public void generateMiniStatement(){	
		
	}
	

}



