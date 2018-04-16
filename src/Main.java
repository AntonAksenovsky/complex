import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static Complex addComplex() {
        return new Complex(in.nextDouble(), in.nextDouble());
    }


    public static void main(String[] args) {
        System.out.println("ВВедите действительную и мнимую часть комплексного числа 1");
        Complex complexA = addComplex();
        System.out.println("ВВедите действительную и мнимую часть комплексного числа 2");
        Complex complexB = addComplex();

        System.out.println("complex_1 = " + complexA.toString());
        System.out.println("complex_2 = " + complexB.toString());

        Complex sum = complexA.add(complexB);
        System.out.println("complex_1 + complex_2 = " + sum.toString());

        Complex difference = complexA.subtract(complexB);
        System.out.println("complex_1 - complex_2 = " + difference.toString());

        Complex multi = complexA.multiply(complexB);
        System.out.println("complex_1 * complex_2 = " + multi.toString());


    }
}
