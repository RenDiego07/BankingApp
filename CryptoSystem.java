
public class CryptoSystem implements SystemFactory{
	
	public DepositSystemAF createDepositSystem() {
		return (DepositSystemAF) new CryptoDepositSystem();
	} 
	
	public WithdrawalSystemAF createWithdrawalSystem() {
		return (WithdrawalSystemAF) new CryptoWithdrawalSystem();
	}
	
	public BalanceSystemAF createBalanceSystem() {
		return (BalanceSystemAF) new CryptoBalanceSystem();
	}

	@Override
	public DepositSystemAF createDepositSystemAF() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WithdrawalSystemAF createWithdrawalSystemAF() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BalanceSystemAF createBalanceSystemAF() {
		// TODO Auto-generated method stub
		return null;
	}


}
