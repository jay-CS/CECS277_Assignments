package Part2;

public class SimpleName implements NameInterface{
		//First name
		private String name; 
	
		
		/**
		 * Initializes instance variable
		 */
		public SimpleName() {
			name = " ";
		}
		
		/**
		 * Initializes instance variable
		 * @param l, the full name
		 */
		public SimpleName(String l) {
			name = l;
		}
		
		/**
		 * Sets the first name to the String f
		 */
		public void setName(String f) {
			name = f;
		}
		
		
		/**
		 * Returns the name
		 */
		public String getName() {
			return name ;
		}
	

	}

