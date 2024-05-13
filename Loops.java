import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                if((i+j)%2==0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
        // int b = 1;
        // int c = 1;
        // for(int i=0;i<n;i++) {
        //     for(int j=0;j<=i;j++) {
        //         System.out.print(b + " ");
        //         b = 1 - b;
        //     }
        //     b = 1 - c;
        //     c = 1 - c;
        //     System.out.println();
        // }

        // int a = 1;
        // for(int i=1;i<=n;i++) {
        //     for(int j=1;j<=i;j++) {
        //         System.out.print(a + " ");
        //         a++;
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++) {
        //     for(int j=1;j<=n-i+1;j++)
        //         System.out.print(j + " ");
        //     System.out.println();
        // }

        // for(int i=0;i<n;i++) {
        //     for(int j=i+1;j<n;j++)
        //         System.out.print("  ");
        //     for(int j=0;j<=i;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++) {
        //     for(int j=1;j<=n;j++) {
        //         if(i==1 || j==1 || i==n || j==n)
        //             System.out.print("* ");
        //         else
        //             System.out.print("  ");
        //     }
        //     System.out.println();
        // }

    } 
}
