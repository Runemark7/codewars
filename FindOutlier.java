public class FindOutlier {
    static int find(int[] integers) {

        int odd = 0;
        int even = 0;
        int isOdd = 0;
        int isEven = 0;

        for (int i = 0; i < integers.length; i++) {
            if(integers[i]%2 == 0){
                if(isOdd == 1){
                    return integers[i];
                }
                even++;
            }else{
                if(isEven == 1){
                    return integers[i];
                }
                odd++;
            }

            if(odd == 1 && even == 1){
                if(integers[i+1]%2==0){
                    if (integers[i]%2 == 0) {
                        return integers[i-1];
                    }else{
                        return integers[i];
                    }
                }else{
                    if (integers[i]%2 == 1) {
                        return integers[i-1];
                    }else{
                        return integers[i];
                    }
                }
            }
            if(odd > 1){
                isOdd = 1;
            }
            if(even > 1){
                isEven = 1;
            }
        }

        return 0;
    }

    public static void main(String[] args){
        int[] exampleTest1 = {2,6,8,-10,3};
        int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};

        boolean testone = (3 == find(exampleTest1));
        boolean testtwo = (206847684 == find(exampleTest2));
        System.out.println(testone);
        System.out.println(testtwo);
    }
}
