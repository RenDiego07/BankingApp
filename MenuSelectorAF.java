
public class MenuSelectorAF {
	private DepositSystemAF DepositSystemAF;
    private WithdrawalSystemAF WithdrawalSystemAF;
    private BalanceSystemAF BalanceSystemAF;

    public MenuSelectorAF(SystemFactory factory) {
    	DepositSystemAF = (DepositSystemAF) factory.createDepositSystemAF();
    	WithdrawalSystemAF = (WithdrawalSystemAF) factory.createWithdrawalSystemAF();
    	BalanceSystemAF = (BalanceSystemAF) factory.createBalanceSystemAF();
    }

    public void initialiaze() {
    	DepositSystemAF.initialize();
    	WithdrawalSystemAF.initialize();
    	BalanceSystemAF.initialize();
    }
}
