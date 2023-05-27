import java.util.*;

public class string{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();

		System.out.println("Hello " + name);
		System.out.println("String length " + name.length());

		System.out.println("Individual carecter");
		for(int i=0; i<name.length(); i++){

			System.out.println(name.charAt(i));
		}

		String name1 = "Avi";
		String name2 = "Avi";

		if(name1.compareTo(name2) == 0){
			System.out.println("String are equal!");
		}
		else{
			System.out.println("String are not equal!");
		}
		

	}
}