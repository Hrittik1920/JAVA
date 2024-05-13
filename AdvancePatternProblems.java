import java.util.Scanner;

public class AdvancePatternProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int i,j;
        // for(i=1;i<=n;i++) {
        //     for(j=i;j<n;j++)
        //         System.out.print("  ");
        //     for(j=1;j<=2*i-1;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }
        // for(i=1;i<=n;i++) {
        //     for(j=1;j<i;j++)
        //         System.out.print("  ");
        //     for(j=1;j<=2*(n-i+1)-1;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }
        //       *
        //     * * *
        //   * * * * *
        // * * * * * * *
        // * * * * * * *
        //   * * * * *
        //     * * *
        //       *
        
        // for(i=1;i<=n;i++) {
        //     for(j=i;j<n;j++)
        //         System.out.print("  ");
        //     for(j=i;j>0;j--)
        //         System.out.print(j + " ");
        //     for(j=2;j<=i;j++)
        //         System.out.print(j + " ");
        //     System.out.println();
        // }
        // //         1
        // //       2 1 2
        // //     3 2 1 2 3
        // //   4 3 2 1 2 3 4
        // // 5 4 3 2 1 2 3 4 5

        // for(i=1;i<=n;i++) {
        //     for(j=i;j<n;j++)
        //         System.out.print(" ");
        //     for(j=1;j<=i;j++)
        //         System.out.print(i + " ");
        //     // int a=1;
        //     // for(j=1;j<=2*i-1;j++) {
        //     //     if(a==1)
        //     //         System.out.print(i);
        //     //     else
        //     //         System.out.print(" ");
        //     //     a = 1-a;
        //     // }
        //     System.out.println();
        // }
        // //      1
        // //     2 2
        // //    3 3 3
        // //   4 4 4 4
        // //  5 5 5 5 5

        for(i=1;i<=n;i++) {
            for(j=i;j<n;j++)
                System.out.print("  ");
            for(j=1;j<=n;j++)
                System.out.print("* ");
            System.out.println();
        }
        // //           * * * * *
        // //         * * * * *
        // //       * * * * *
        // //     * * * * *
        // //   * * * * *

        // for(i=1;i<=n;i++) {
        //     for(j=1;j<=i;j++)
        //         System.out.print("* ");
        //     for(j=1;j<=2*(n-i);j++)
        //         System.out.print("  ");
        //     for(j=1;j<=i;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }
        // for(i=1;i<=n;i++) {
        //     for(j=i;j<=n;j++)
        //         System.out.print("* ");
        //     for(j=1;j<=2*(i-1);j++)
        //         System.out.print("  ");
        //     for(j=i;j<=n;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }
        // // Butterfly Pattern
        // // *         *
        // // * *     * *
        // // * * * * * *
        // // * * * * * *
        // // * *     * *
        // // *         *
    }
}
