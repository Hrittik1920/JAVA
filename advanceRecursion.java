import java.util.HashSet;

public class advanceRecursion {
//----------------------------------------------------------------------------------------------------------
    // #7 -> Keypad combinations by a string

    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String str,int idx,String combination) {
        if(idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for(int i=0;i<mapping.length();i++) {
            printComb(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "2345";
        printComb(str, 0, "");
    }
//---------------------------------------------------------------------------------------------------------
    // #6 -> print all the unique subsequences of the string

    // public static void subsequences(String str,int idx,String newString,HashSet<String> set) {
    //     if(idx == str.length()) {
    //         if(set.contains(newString)) {
    //             return;
    //         } else {
    //             set.add(newString);
    //             System.out.println(newString);
    //             return;
    //         }
    //     }
    //     char currChar = str.charAt(idx);
    //     //hoga tab
    //     subsequences(str, idx+1, newString+currChar,set);

    //     //nhi hoga tab
    //     subsequences(str, idx+1, newString,set);
    // }
    // public static void main(String args[]) {
    //     String str = "abc";
    //     HashSet<String> set = new HashSet<>();
    //     subsequences(str, 0, "",set);
    // }
//--------------------------------------------------------------------------------------------------------
    // #5 -> Removing Duplicates

    // public static boolean[] map = new boolean[26];
    // public static void removeDuplicates(String str,int idx,String newString) {
    //     if(idx == str.length()) {
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if(map[currChar - 'a']) {
    //         removeDuplicates(str, idx+1, newString);
    //     } else {
    //         map[currChar - 'a'] = true;
    //         removeDuplicates(str, idx+1, newString+currChar);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str = "abbcdcadeea";
    //     removeDuplicates(str, 0, "");
    // }
//--------------------------------------------------------------------------------------------------------    
    // #4 -> Check if the array is strictly incresing

    // public static boolean strictlySorted(int[]arr,int idx) {
    //     if(idx == arr.length - 1) {
    //         return true;
    //     }
    //     if(arr[idx] < arr [idx + 1]) {
    //         return strictlySorted(arr, idx + 1);
    //     } else {
    //         return false;
    //     }
    // }
    // public static void main(String[] args) {
    //     int arr[] = {3,5,6,8,10,45};
    //     System.out.println(strictlySorted(arr, 0));
    // }
//-------------------------------------------------------------------------------------------------------
    // #3 -> Moving all 'x' at the end of the string

    // public static StringBuilder newString = new StringBuilder("");
    // public static int count = 0;
    // public static void allElementAtLast(String str,int idx,char element) {
    //     if(idx == str.length()) {
    //         for(int i=0;i<count;i++) {
    //             newString.append(element);
    //         }
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currStr = str.charAt(idx);
    //     if(currStr != element) {
    //         newString.append(currStr);
    //     } else {
    //         count++;
    //     }
    //     allElementAtLast(str, idx + 1, element);
    // }
    // public static void main(String[] args) {
    //     String str = "axxbxcxd";
    //     allElementAtLast(str, 0, 'x');
    // }
//---------------------------------------------------------------------------------------------
    // #2 -> First and last occurance of the element

    // public static int first = -1;
    // public static int last = -1;
    // public static void occurance(String str,int ind,char element) {
    //     if(ind == str.length()) {
    //         System.out.println(first);
    //         System.out.println(last);
    //         return;
    //     }
    //     char currStr = str.charAt(ind);
    //     if(currStr == element){
    //         if(first == -1) {
    //             first = ind;
    //         } else {
    //             last = ind;
    //         }
    //     }
    //     occurance(str, ind + 1, element);
    // }
    // public static void main(String[] args) {
    //     String str = "bcghtaaaersaaasea";
    //     occurance(str, 0,'a');
    // }
//----------------------------------------------------------------------------------------
    // #1 -> Reversing a string

    // public static void reverseString(String str,int idx) {
    //     if(idx<0)
    //         return;
    //     System.out.print(str.charAt(idx));
    //     reverseString(str, idx-1);
    // }
    // public static void main(String[] args) {
    //     String str= "abcd";
    //     reverseString(str, str.length()-1);
    // }
}
