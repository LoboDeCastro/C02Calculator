public class Calculator {

    public static void main(String[] args) {
        int a = 1;
        double b = 2.34;
        boolean c = true;
        char d = 'D';
        String e = "Hello";

        int x = 4;
        int y = 9;

        System.out.println(sum(x,y));
        System.out.println(sub(x,y));
        System.out.println(mult(x,y));
        System.out.println(div(x,y));
        System.out.println(mod(x,y));


    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int mult(int a, int b) {
        return a * b;
    }
    public static int div(int a, int b) {
        return a / b;
    }
    public static int mod(int a, int b) {
        return a % b;
    }
}
