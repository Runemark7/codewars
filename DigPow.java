public class DigPow {
    public static long digPow(int n, int p) {
        // your code
        //from int to string to int arr
        String temp = Integer.toString(n);
        int[] intArr = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            intArr[i] = temp.charAt(i) - '0';
        }

        long totalVal = 0;

        for (int i = 0; i < intArr.length; i++) {
            totalVal += Math.pow(intArr[i],p+i);
        }

        if(totalVal%n==0){
            return totalVal/n;
        }else{
            return -1;
        }


    }

    public static void main(String[] args) {

        boolean testone = (1 == digPow(89,1));
        System.out.println(testone);


    }
}
