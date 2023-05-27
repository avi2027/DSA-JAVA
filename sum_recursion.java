import java.util.*;
public class sum_recursion{
	public static void print_sum(int i,int n,int sum){
		if(i == n){
			sum += i;
			System.out.println(sum);
			return;
		}
		sum += i;
		print_sum(i+1, n, sum);
		System.out.println(i);

	}
	public static void main(String args[]){
		print_sum(1,10,0);
	}
}