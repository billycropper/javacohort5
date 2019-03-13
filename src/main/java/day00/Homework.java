package day00;

public class Homework {
    public static void main(String[] args) {
        System.out.println(add(2,4));
        System.out.println(subtract(5,8));
        System.out.println(multiply(8,2));
        System.out.println(divide(2,4));
        System.out.println(exponent(12,5));
    }

    public static int add(int x, int y){
        return x + y;
    }

    public static int subtract(int x, int y){
        return x - y;
    }

    public static int multiply(int x, int y){
        return x * y;
    }

    public static int divide(int x, int y){
        return x / y;
    }

    public static double exponent(double z, double y){
        return Math.pow(z, y);
    }

}

