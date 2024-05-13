import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        // add operation
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(0,0);
        arr.addAll(0, arr.subList(0,3));
        System.out.println(arr);

        // set operations
        arr.set(3,5);

        // remove or delete operation
        arr.remove(0);
        arr.removeAll(arr.subList(0,3));

        // size() and get() operations
        for(int i=0;i<arr.size();i++) {
            System.out.print(arr.get(i) + " ");
        }

        arr.add(0,8);
        arr.add(1,5);
        
        // Sorting aur Collection framework
        Collections.sort(arr);
        System.out.println(arr);

        
    }
}
