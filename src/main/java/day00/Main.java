package day00;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello world");

        addTwoNumbersAndReturnDecimal(10);
        multiplyNum(5, 5);

        seperateArrayWHyphen(fruit);

        Homework calc = new Homework();
        calc.add(2,4);


    }

    public static float addTwoNumbersAndReturnDecimal(float x) {
        float y = 2.5F;

        return y + x;
    }

    //write method takes in array of strings
    public static int multiplyNum(int x, int y) {
        int z = x * y;
        return z;
    }

    public static String[] fruit = {"Apple", "Grape", "Pear", "Orange", "Banana", "Kiwi"};

    /*public static void arrayFruit(String[] fruit) {
        for (int i = 0; i < fruit.length; i++) {
            String str = fruit[i] + "-";
            StringBuilder sb = new StringBuilder(str);
            sb.deleteCharAt(sb.length() - 1);
            System.out.print(sb);

        }
    }*/

    public static void seperateArrayWHyphen(String[] array){
        String sep = "";

        for(String s : array){
            //System.out.print(s);
            System.out.print(sep + s);
            //System.out.print(sep);
            sep = "-";
        }
    }
}

