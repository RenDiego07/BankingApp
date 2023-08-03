package paquete;

public class Yen implements BalanceStrategy{
	
	private static double balanceYen;

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balanceYen;
	}

	@Override
	public void depositBalance(double balance) {
		 Yen.balanceYen += balanceYen;
		
	}

	@Override
	public void withdrawBalance(double balance) {
		Yen.balanceYen -= balanceYen;
		
	}

}


