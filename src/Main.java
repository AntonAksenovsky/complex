import java.util.Scanner;

public class Main {
    public static Complex complexA;
    public static Complex complexB;

    public static void addComplex() {
        Scanner in = new Scanner(System.in);
        System.out.println("ВВедите действительную и мнимую часть комплексного числа 1");
        complexA = new Complex(in.nextDouble(), in.nextDouble());
        System.out.println("ВВедите действительную и мнимую часть комплексного числа 2");
        complexB = new Complex(in.nextDouble(), in.nextDouble());
    }

    public static void main(String args[]) {
        addComplex();
        System.out.println("complex_1 = " + complexA.toString());
        System.out.println("complex_2 = " + complexB.toString());

        Complex cSum = complexA.Add(complexB);
        System.out.println("complex_1 + complex_2 = " + cSum.toString());

        Complex cDiff = complexA.Sub(complexB);
        System.out.println("complex_1 - complex_2 = " + cDiff.toString());

        Complex cMulti = complexA.Multi(complexB);
        System.out.println("complex_1 * complex_2 = " + cMulti.toString());
    }
}
