public class findUniq {
    public static double findUniq(double arr[]) {

        double notUniq = 0;
        if(arr[0] == arr[1] || arr[0] == arr[2]){
            notUniq = arr[0];
        }else{
            return arr[0];
        }
        for (double dub: arr) {
            if(dub != notUniq){
                return dub;
            }
        }

        return notUniq;

    }

    public static void main(String[] args) {
        boolean testone = (1.0 == findUniq(new double[]{0, 1, 0}));
        System.out.println(testone);
    }
}
