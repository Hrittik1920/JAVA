import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18) {
            System.out.println("You are an Adult");
        } else if (age>12 && age<18) {
            System.out.println("You are a Teenage");
        } else {
            System.out.println("You are a child");
        }
        // if (age >= 18)
        //     System.out.println("You are an Adult");
        // else if (age < 18 && age > 12)
        //     System.out.println("You are a Teenage");
        // else
        //     System.out.println("You are a child");
    }
}
