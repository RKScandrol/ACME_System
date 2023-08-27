package ver1;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello from Eclipse");
		
		System.out.println("Ryan is working locally on his branch");

	}
	
	public static void heyNow() {
		String Msg = "Hey Now!";
		System.out.println(Msg);
	}
	
	public static void whatNow() {
		Scanner scan = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username");

	    String userIn = scan.nextLine();  // Read user input
	    
	    String msg = userIn + ", what for?";
	    System.out.println(msg);
	}


}
