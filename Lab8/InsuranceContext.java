
public class InsuranceContext {
	InsuranceState is = null;
	
	
	public void setState(InsuranceState is) {
		this.is = is;
	}
	
	public void stateAction(Employees e) {
		is.EmployeeAction(e);
	}
	
}
