package paquete;

public class Euro implements BalanceStrategy {
	
	private static double balanceEuro;

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balanceEuro;
	}

	@Override
	public void depositBalance(double balance) {
		 Euro.balanceEuro += balanceEuro;
		
	}

	@Override
	public void withdrawBalance(double balance) {
		Euro.balanceEuro -= balanceEuro;
		
	}

}

