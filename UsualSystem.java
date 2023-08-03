
public class UsualSystem implements SystemFactory{
	
	public DepositSystemAF createDepositSystem() {
		return (DepositSystemAF) new UsualDepositSystem();
	} 
	
	public WithdrawalSystemAF createWithdrawalSystem() {
		return (WithdrawalSystemAF) new UsualWithdrawalSystem();
	}
	
	public BalanceSystemAF createBalanceSystem() {
		return (BalanceSystemAF) new UsualBalanceSystem();
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