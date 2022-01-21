import java.util.*;
public class arrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {
        if(b.length == 0){
            return a;
        }

        if(a.length == 0){
            return a;
        }
        // Your code here

        int[] c = new int[a.length];
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            for (int bInt: b) {
                if(a[i] != bInt){
                    counter++;
                    c[counter] = a[i];
                }
            }
        }

        int[] d = new int[counter];
        for (int i = 0; i < counter; i++) {
            d[i] = c[i];
        }

        return d;
    }

    public static void main(String[] args) {
        boolean testone  = (new int[] {2} == arrayDiff(new int [] {1,2}, new int[] {1}));
        System.out.println(testone);
    }

}
