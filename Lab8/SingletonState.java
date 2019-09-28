
public class SingletonState {
	static SingletonState IS = null;
	
	private SingletonState() {}
	
	public static SingletonState getInstance() {
		if(IS == null) {
			return new SingletonState();
		}
		return IS;
	}
	
	public void createContext(Employees e,String input) {
		InsuranceContext ic = new InsuranceContext();
		InsuranceState is = new state_Off();
		if(input.equalsIgnoreCase("y")) {
			is = new state_On();
		}
		
		ic.setState(is);
		ic.stateAction(e);
		
	}
}
