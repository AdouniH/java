
public class Context {
	protected Strategy strategy;
	
	public Context() {
		strategy=new StrategyImpl1();
	}
	public void appliquerStrategy() {
		strategy.operationStrategy();
	}
	public Strategy getStrategy() {
		return strategy;
	}
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
}
