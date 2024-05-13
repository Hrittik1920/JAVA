import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        // System.out.println("*\n**\n***\n****");
        // String name = "Tony Stark";
        // System.out.println(name);
        // int a = 4;
        // int b = 5;
        // // int sum = a + b;
        // // System.out.println(sum);
        // int fact = a*b/(a-b);
        // System.out.println(fact);
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}
