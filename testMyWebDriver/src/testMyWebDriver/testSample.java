package testMyWebDriver;

public class testSample {
	static int x=44;
	
	testSample() {
		x=33;
		System.out.println("Will this print first?");
	
	}

	public static void hh() {
		System.out.println("Neethu");

	}

	public static void main(String[] args) {
		System.out.println("before Object Creation x = "+ x);

		testSample testSample = new testSample(); //Creating a Object for class testSample - Object is declared using the 'new' keyword
		System.out.println("After Object Creation = "+ x);
		x=22;
		System.out.println("What is the value of  X = "+ x);
		
		
//		FirefoxDriver hhh = new FirefoxDriver();
//		WebDriver ggg = new InternetExplorer();
//		ggg.click("hhh");
//		
	}
}