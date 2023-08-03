package paquete;

public class Client {
	   public static void main(String[] args) {
		      Context context = new Context(new Dollar());	
		      //100 dólares
		      context.executeStrategy(100);

		      context = new Context(new Euro());	
		      //100 euros
		      context.executeStrategy(100);

		      context = new Context(new Yen());		
		      //100 yenes
		      context.executeStrategy(100);
		   }

}


