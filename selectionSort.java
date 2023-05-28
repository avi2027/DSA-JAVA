import java.util.*;

public class selectionSort{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int n,i,j;
		System.out.print("Enter array size: ");
		n = sc.nextInt();

		int arr[] = new int[n];

		System.out.print("Enter array element: ");v
		for(i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		//selection sort
		for(i=0; i<arr.length; i++){
			int smallest = i;
			for(j=i+1; j<arr.length; j++){
				if(arr[j] < arr[smallest]){
					smallest = j;
				}
			}

			//swap
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
		}

		System.out.println("The selection sorting array are");
		for(i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}