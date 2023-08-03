
public interface SystemFactory {
	public DepositSystemAF createDepositSystemAF(); 
	public WithdrawalSystemAF createWithdrawalSystemAF();
	public BalanceSystemAF createBalanceSystemAF();
}
