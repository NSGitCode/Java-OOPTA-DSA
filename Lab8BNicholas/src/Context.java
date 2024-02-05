
public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy){
	      this.strategy = strategy;
	   }

	   public RPS executeStrategy(RPS last){
	      return strategy.shoot(last);
	   }
}
