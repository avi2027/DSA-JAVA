import java.util.*;

public class function{
	// creat function
	public static String printMyName(String name){
		System.out.println(name);
		return name;
	}

	// main function
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your name: ");
		String name = sc.nextLine();

		String myName = printMyName(name);
		//System.out.print("Hi " + printMyName());
		// System.out.print("Hi ");
		// printMyName(name);

		System.out.print("Hi " + myName);
	}
}