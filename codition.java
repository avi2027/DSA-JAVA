import java.util.*;

public class codition{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int button;

		System.out.print("Enter any button: ");
		button = sc.nextInt();

		// if(number % 2 == 0){
		// 	System.out.println("Even number");
		// }else{
		// 	System.out.println("Odd number");
		// }

		switch(button){
			case 1:System.out.print("Avi Mondal\n");
			break;
			case 2:System.out.print("Sayed Khan\n");
			break;
			case 3:System.out.print("Rajesh Rudra\n");
			break;
			default : System.out.println("Invalid Button");
		}

	}
}