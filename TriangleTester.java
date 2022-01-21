public class TriangleTester {
    public static boolean isTriangle(int a, int b, int c){

        for (int i = 0; i < 3; i++) {
            if(i == 0){
                System.out.println(a*a);
                System.out.println(b*b);
                System.out.println(c*c);
                if(c*c == (a*a+b*b)){
                    return true;
                }
            }else if (i == 1){
                System.out.println(a*a);
                System.out.println(b*b);
                System.out.println(c*c);
                if(a*a == (c*c+b*b)){
                    return true;
                }
            }else{
                System.out.println(a*a);
                System.out.println(b*b);
                System.out.println(c*c);
                if(b*b == (c*c+a*a)){
                    return true;
                }
            }

            System.out.println("--------------");
        }

        return false;
    }

    public static void main(String[] args) {
        boolean testone = (isTriangle(1, 2, 2));
        boolean testtwo = (isTriangle(7, 2, 2));

        System.out.println(testone);
        System.out.println(testtwo);
    }
}
