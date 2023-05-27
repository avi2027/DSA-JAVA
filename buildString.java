import java.util.*;

public class buildString{
	public static void main(String args[]){

		//create a string builder
		StringBuilder sb = new StringBuilder("H");
		//insert a string last
		sb.append("e");
		sb.append("l");
		sb.append("l");
		sb.append("o");
		sb.append("!");
		System.out.println(sb);

		//reverse string
		StringBuilder rev = new StringBuilder("Tithi");

		for(int i=0; i<rev.length()/2; i++){
			int front = i;
			int back = rev.length() - 1 - i; //5-1-0 => 4

			char frontChar = rev.charAt(front);
			char backChar = rev.charAt(back);

			rev.setCharAt(front, backChar);
			rev.setCharAt(back, frontChar);
		}
		System.out.println("The main string is Tithi");
		System.out.println("The reverse strig: " + rev);

		//Anather way of reverse string

		StringBuilder avi = new StringBuilder("canada");
		avi.reverse();
		String reverseString = avi.toString();
		System.out.println("The anather main string canada");
		System.out.println("The anather reverse string: " + reverseString);
	}
}