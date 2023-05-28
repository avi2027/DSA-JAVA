import java.util.*;

public class bubblesort{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n,i,j,temp;

		System.out.print("Enter array size: ");
		n = sc.nextInt();

		int arr[] = new int[n];
		
		System.out.print("Enter array element: ");
		for(i=0;i<n; i++){
			arr[i] = sc.nextInt();
		}

		// Bubble sort

		for(i=0; i<n-1; i++){
			for(j=0; j<n-i-1; j++){
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		System.out.println("The sorting bubble sort");

		for(j=0; j<n; j++){
			System.out.print(arr[j] + " ");
		}
	}
}