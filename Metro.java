import java.util.*;

public class Metro {
    public static int countPassengers(ArrayList<int[]> stops) {

        int pplOnBus = 0;
        for (int[] stop: stops) {
            //[0] in [1] out
            pplOnBus += stop[0];
            pplOnBus -= stop[1];
        }

        return pplOnBus;
    }

    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});

        boolean testone = (5 == countPassengers(list));
        System.out.println(testone);
    }
}
