import java.util.*;

public class twoDarray{
	public static void main(String args[]){
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter colum: ");
		int colum = sc.nextInt();

		int[][] arr = new int[rows][colum];

		System.out.println("Enter rows element and colum element");
		//Input
		for(i=0; i<rows; i++){
			for(j=0; j<colum; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		//Output
		System.out.println("The Final matrix are");
		for(i=0; i<rows; i++){
			for(j=0; j<colum; j++){
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}


	}
}