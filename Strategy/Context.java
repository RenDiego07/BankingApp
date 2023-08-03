package paquete;

public class Context {
	   private BalanceStrategy strategy;

	   public Context(BalanceStrategy strategy){
	      this.strategy = strategy;
	   }

	   public void executeStrategy(double balance){
		   //ejemplo de una estrategia posible, un retiro
	      strategy.withdrawBalance(balance);
	   }
}

