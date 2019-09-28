package Part3;

public class RobotContext {
	
	RobotState state = null;
	Robot robot = new Robot();
	
	public void setState(RobotState rs) {
		state = rs;
	}
	
	public void StateAction() {
		state.RobotAction(robot);
		if(state instanceof BoringState) {
			setState(new HappyState());
		}
	}
	
}
