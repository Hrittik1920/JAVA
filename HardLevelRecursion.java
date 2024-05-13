import java.util.ArrayList;

public class HardLevelRecursion {
//-----------------------------------------------------------------------------------------------------
    // #5 -> Print all the subsets of a set of first n natural numbers

    public static void printSubsets(int var,int n,ArrayList<Integer> subset) {
        if(var == n + 1) {
            System.out.println(subset);
            return;
        }
        // add hoga
        subset.add(var);
        printSubsets(var + 1,n, subset);

        // add nhi hoga 
        subset.remove(subset.size()-1);
        printSubsets(var + 1,n, subset);
    }

    public static void main(String[] args) {
        int n = 4;
        ArrayList<Integer> subset = new ArrayList<>();
        printSubsets(1,n, subset);
    }
//-----------------------------------------------------------------------------------------------------
    // #4 -> Find the number of ways in which you can invite n people in your party, single or in pairs

    // public static int callGuests(int n) {
    //     if(n <= 1)
    //         return 1;

    //     // singles
    //     int singles = callGuests(n-1);

    //     // Pairs
    //     int pairs = (n-1) * callGuests(n-2);

    //     return singles + pairs;
    // }
    // public static void main(String agrs[]) {
    //     int n = 4;
    //     System.out.println(callGuests(n));
    // }
//-----------------------------------------------------------------------------------------------------
    // #3 -> Place Tiles (1 x m) in a floor of size (n x m)

    // public static int placeTiles(int n,int m) {
    //     if(n == m) 
    //         return 2;
    //     if(n < m) 
    //         return 1;
    //     //horizontal
    //     int horPlacement = placeTiles(n-1,m);

    //     //vertical
    //     int verPlacement = placeTiles(n-m,m);

    //     return horPlacement + verPlacement;
    // }
    // public static void main(String[] args) {
    //     int n = 4,m = 2;
    //     System.out.println(placeTiles(n, m));
    // }
//---------------------------------------------------------------------------------------------------
    // #2 -> Count total path in a maze to move from (0,0) to (n,m)
    
    // public static int printPaths(int i,int j,int n,int m) {
    //     if(i == n+1 || j == m+1) {
    //         return 0;
    //     }
    //     if(i == n  && j == m) {
    //         return 1;
    //     }
    //     //movment to right
    //     int rightmove = printPaths(i+1,j,n,m);

    //     //downward movment
    //     int downward = printPaths(i,j+1,n,m);

    //     return rightmove + downward;
    // }
    // public static void main(String[] args) {
    //     int n=2,m=3;
    //     System.out.println(printPaths(0, 0, n, m));
    // }
//---------------------------------------------------------------------------------------------------
    // #1 -> Print all the possible permutation of the string

    // public static void permutation(String str,String perm) {
    //     if(str.length() == 0) {
    //         System.out.println(perm);
    //         return;
    //     }
    //     for(int i=0;i<str.length();i++) {
    //         char currChar = str.charAt(i);
    //         String newString = str.substring(0, i) + str.substring(i+1);
    //         permutation(newString, perm+currChar);
    //     }    
    // }
    // public static void main(String[] args) {
    //     String str = "abc";
    //     permutation(str, "");
    // }
}
