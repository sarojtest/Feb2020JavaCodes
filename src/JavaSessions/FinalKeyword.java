package JavaSessions;

public class FinalKeyword {

	public static void main(String[] args) {

		final int i = 10;
		System.out.println(i);
	
		final int NumberOfDaysInAWeek = 7;
		
		//NumberOfDaysInAWeek = 10;
		
		int salary = NumberOfDaysInAWeek * 100;
		
		System.out.println(salary);

		final String LOGIN_PAGE_TITLE = "Google";
		//LOGIN_PAGE_TITLE = "Facebook";
		if(LOGIN_PAGE_TITLE.equals("Google")){
			System.out.println("correct title");
		}
		
		
	}

}
