package Part3;



public class RobotTester {

	public static void main(String[] args) {
		RobotContext rc = new RobotContext();
		rc.setState(new HappyState());
		rc.StateAction();
		
		rc.setState(new BoringState());
		rc.StateAction();
		
		rc.StateAction();
	}
	
}
