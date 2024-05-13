import java.util.Scanner;

public class Function {
    // public static int greaterDivisor(int a,int b) {
    //     int divisor = 1;
    //     for(int i=2;i<=a || i<=b;i++) {
    //         if(a%i == 0  &&  b%i == 0)
    //             divisor = i;
    //     }
    //     return divisor;
    // }
    public static int fibonacci(int n) {
        int a=0,b=1;
        if(n==1)
            return a;
        if(n==2)
            return b;
        for(int i=0;i<n-2;i++) {
            b=a+b;
            a=b-a;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // // System.out.println(greaterDivisor(a, b));
        System.out.println(fibonacci(n));
    }
}
