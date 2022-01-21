public class Order {
    public static String order(String words) {
        if(words.isEmpty()){
            return "";
        }
        String[] wordsArr = words.split(" ");
        String[] rightOrderArr = new String[wordsArr.length];

        Integer i = 1;
        while (i != wordsArr.length+1){
            for (String word: wordsArr) {
                if(word.contains(i.toString())){
                    rightOrderArr[i-1] = word;
                    i++;
                    break;
                }
            }
        }


        return String.join(" ",rightOrderArr);
    }

    public static void main(String[] args) {
        boolean testone = (order("is2 Thi1s T4est 3a") == "Thi1s is2 3a T4est");
        System.out.println(testone);

    }
}
