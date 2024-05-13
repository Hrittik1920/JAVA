import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // String str = "Hrittik Singh";
        // str = "Singh Hrittik";
        // System.out.println(str.substring(8,str.length()));
        // for(int i=0;i<str.length();i++){
        //     System.out.print(str.charAt(i));
        // }
        // System.out.println();
        // String name1="Hrittik";
        // String name2="Hrittik";
        // // if(new String("Tony") == new String("Tony"))
        // if(name1.compareTo(name2)==0)
        //     System.out.println("string are equal\n");
        // else
        //     System.out.println("string are not equal\n");
        StringBuilder sb = new StringBuilder("Tony");
        sb.setCharAt(3, 'i');
        System.out.println(sb);
        sb.insert(3,'n');
        System.out.println(sb);
        sb.delete(3,4);
        sb.delete(3,4);
        System.out.println(sb);
        sb.append('y');
        System.out.println(sb);
        sb.toString();
        System.out.println(sb);
        for(int i=0;i<sb.length()/2;i++){
            char front = sb.charAt(i);
            char back = sb.charAt(sb.length()-i-1);
            
            sb.setCharAt(i, back);
            sb.setCharAt(sb.length()-i-1, front);
        }
        System.out.println(sb);
    }
}
