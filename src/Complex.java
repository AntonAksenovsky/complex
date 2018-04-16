public class Complex {
    private double real, imaginary;  //TODO поменять на camelCase

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public String toString() {
        if (imaginary >= 0)
            return real + " + " + imaginary + "i";
        else
            return real + " - " + -imaginary + "i";
    }

    public Complex add(Complex complexB) {
        Complex sum = new Complex(real, imaginary);
        sum.real = real + complexB.real;
        sum.imaginary = imaginary + complexB.imaginary;
        return sum;
    }

    public Complex subtract(Complex complexB) {
        Complex diff = new Complex(real, imaginary);
        diff.real = real - complexB.real;
        diff.imaginary = imaginary - complexB.imaginary;
        return diff;
    }

    public Complex multiply(Complex complexB) {
        Complex comp = new Complex(real, imaginary);
        comp.real = real * complexB.real - imaginary * complexB.imaginary;
        comp.imaginary = imaginary * complexB.real + real * complexB.imaginary;
        return comp;
    }
}
