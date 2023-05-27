import java.util.*;

public class recursion1{
	public static void print_decending(int n){
		if(n == 0){
			return;
		}

		System.out.println(n);
		print_decending(n-1);
	}
	
	public static int print_accending(int a,int len){
		if(a == len){
			return 1;
		}
		//System.out.println("Print Accending order");
		System.out.println(a);
		return print_accending(a+1,len);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//decending
		System.out.print("Enter the value: ");
		int n = sc.nextInt();
		System.out.println("Print Decending order");
		print_decending(n);

		//accending
		int a = 1;
		System.out.print("Enter length: ");
		int len = sc.nextInt();
		int printline = print_accending(a,len);
		
		//System.out.println(printline);
	}
}