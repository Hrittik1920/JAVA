public class easyRecursion {
    // public static void printNumber(int n) {
    //     if(n==0)
    //         return;
    //     printNumber(n-1);
    //     System.out.print(n + " ");
    // }

    // public static int factorial(int n) {
    //     if(n==0  ||  n==1)
    //         return 1;
    //     else
    //         return n * factorial(n-1);
    // }

    // public static int fibonacci(int n) {
    //     if(n == 1  ||  n == 2)
    //         return 1;
    //     else
    //         return fibonacci(n-1) + fibonacci(n-2);
    // }

    // public static int powerOf(int n, int pow) {
    //     if(n == 0 && pow == 0) {
    //         System.out.println("Value cann't be evaluated!");
    //         return -1;
    //     }
    //     if(n == 0  ||  pow == 0)
    //         return 1;
    //     else    
    //         return n * powerOf(n,pow - 1);
    // }

    public static int powerOf(int n,int pow) {
        if(n == 0  &&  pow == 0){
            System.out.println("Value cann't be evaluated!");
            return -1;
        }
        if(pow == 0) {
            return 1;
        }
        if(n == 0)
            return 0;
        if(n % 2 == 0)
            return powerOf(n,pow/2) * powerOf(n,pow/2);
        else
            return powerOf(n,pow/2) * powerOf(n,pow/2) * n;
            
    }
    public static void main(String[] args) {
        int n=3;
        int pow =5;
        // System.out.println("Factorial of " + n + " is " + factorial(n));
        // System.out.println(n + "th term of fibonacci series is " + fibonacci(n));
        System.out.println("Value of " + n + " to the power " + pow + " is " + powerOf(n,pow));
    }
}
