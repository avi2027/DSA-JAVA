import java.util.*;

public class arrays{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int i, size;
		System.out.print("Enter the size of the array: ");
		size = sc.nextInt(); // array size Input

		int arr[] = new int[size]; // array define prototipe

		System.out.print("Enter the element of the array: ");
		//array element Input
		for(i=0; i<size; i++){
			
			arr[i] = sc.nextInt();
		}

		System.out.println("Array element are");
		//Array element print
		for(i=0; i<size; i++){
			System.out.println(arr[i]);
		}

		//leanear search

		int key;

		System.out.print("Which element search in this array: ");
		key = sc.nextInt();

		for(i=0; i<arr.length; i++){
			if(arr[i] == key){
				System.out.println("Iteam found at index: " + i);
				
			}
		}

	}
	
}