package Part3;

public class HappyState implements RobotState {
		
	
		public void RobotAction(Robot robot) {
			robot.cook();
			robot.talk();
		}
}
