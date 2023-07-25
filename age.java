import java.util.*;

public class age {
    public static void main(String argd[]){
        Scanner input = new Scanner(System.in);

        int age;
        System.out.println("Enter your age: ");
        age = input.nextInt();

        if(age < 13){
            System.out.println("You are a kid");
        }
        else if(age < 18){
            System.out.println("You are a teenager");
        }
        else{
            System.out.println("You are an adult or older.");
        }
    }
}
