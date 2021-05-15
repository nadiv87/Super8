package basic;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		
		String state="NY";
		switch(state) {
		case "NY":
		System.out.println("Welcome to Empire state");
		break;
		case "FL":
			System.out.println("Welcome to sunshine state");
			break;
		case "NJ":
			System.out.println("Welcome to Garden State");
		default:
			System.out.println("Not a State");
			break;
		}//end switch
				

	}//end of main

}//end of class
