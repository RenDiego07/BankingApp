package paquete;

public class Dollar implements BalanceStrategy{
	
	private static double balanceDollar;

	@Override
	public double getBalance() {
	    return balanceDollar;
	}

	@Override
	public void depositBalance(double balance) {
		 Dollar.balanceDollar += balanceDollar;
		
	}

	@Override
	public void withdrawBalance(double balance) {
		Dollar.balanceDollar -= balanceDollar;
		
	}

}

