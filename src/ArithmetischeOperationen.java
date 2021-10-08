public class ArithmetischeOperationen {

    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //falsch, nur als Beispiel
        int x = 2_0000_0000;
        int y = 2_0000_0000;
        System.out.println(x + y);

        //eine der Variablen multiplizieren; kleine Trick
        double f = (a * 1.0) / b;
        System.out.println("double: " + f);

        int c = 8;
        int d = c++;
        System.out.println("d = " + d);
        System.out.println("c = " + c);

        int e = ++c;
        System.out.println("e = " + e);

        printResult(2+3);
        int A = 2 + 4;
        printResult(A);
        int result = add(2,5);
        printResult(result);
        printResult(add(7,9));
    }

    public static void printResult(int result) {
        System.out.println(result);
    }
    public static int add(int x, int y) {
        return x + y;
    }
}
