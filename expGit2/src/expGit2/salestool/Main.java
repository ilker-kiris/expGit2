package expGit2.salestool;

/**
 * Shortcut to run as Java Project  Ctrl + F11
 * 
 * @author ilker
 *
 */
public class Main {

	public static void main(String[] args) {
		SalesData _sd = new SalesData();
		
		displayGreeting();
		_sd.display();
	}

	private static void displayGreeting() {
		System.out.println("HELLO welcome to expGit2");
		System.out.println("HELLO HAPPY SALES PEOPLE - from expGit2");
		System.out.println("THIS APP SHOWS SALES DATA");
	}
}
