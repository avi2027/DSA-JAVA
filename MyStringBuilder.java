import java.util.*;

public class MyStringBuilder {
    public static void main(String args[]) {
        // create a string builder
        StringBuilder sb = new StringBuilder("Avi");

        System.out.println(sb);

        // only print index 0, which is 'A'
        System.out.println(sb.charAt(0));

        // replace the later 'i' with 'o'
        sb.setCharAt(2, 'O');
        System.out.println(sb);

        // insert a 'T' before the word Avi, final output TAvi
        sb.insert(0, 'T');
        System.out.println(sb);

        //deleate the extra 'T'

        sb.delete(0,1);
        System.out.println(sb);
        
    }
}
