public class Operator {
    public static void main(String[] args) {
        // System.out.println(3<<2);
        // System.out.println(5>>1);
        int a=19; //10011
        int pos=3;
        int bitmask = 1<<pos-1;
        int user=1;
        if(user==1) {
            a = bitmask | a;
        }else{
            int n = ~bitmask;
            a = n & a;
        }
        System.out.println(a);
        // int n = ~bitmask;
        // int ans = n & a;
        // System.out.println(ans);
        // int n = bitmask | a;
        // System.out.println(n); 
        // if((bitmask & a)==0) {
        //     System.out.println("Bit is 0");
        // }else{
        //     System.out.println("Bit is 1");
        // }
    }
}
