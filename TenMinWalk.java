public class TenMinWalk {

    // one street each dir
    // one minute each dir

    // is ten directions
    // is end same as start

    //              N S W E


    public static boolean isValid(char[] walk) {
        int posH = 0;
        int posL = 0;
        String listLength = new String(walk);
        if(listLength.length()==10){
            for (int i = 0; i < 10; i++) {
                switch (walk[i]) {
                    case 'n' -> posH++;
                    case 's' -> posH--;
                    case 'w' -> posL++;
                    case 'e' -> posL--;
                }
            }

            return posH == 0 && posL == 0;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        boolean test = isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'});
        System.out.println(test);
    }
}