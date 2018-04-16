public class Complex {
    private double dReal, dImaginary;

    public Complex() {
    }

    public Complex(double dReal, double dImaginary) {
        this.dReal = dReal;
        this.dImaginary = dImaginary;
    }

    public String toString() {
        if (dImaginary >= 0)
            return dReal + " + " + dImaginary + "i";
        else
            return dReal + " - " + -dImaginary + "i";
    }

    // sum of two complex numbers cA, cB

    public Complex Add(Complex complexB) {
        Complex sum = new Complex();
        sum.dReal = dReal + complexB.dReal;
        sum.dImaginary = dImaginary + complexB.dImaginary;
        return sum;
    }

    // difference of two complex numbers cA, cB

    public Complex Sub(Complex complexB) {
        Complex diff = new Complex();
        diff.dReal = dReal - complexB.dReal;
        diff.dImaginary = dImaginary - complexB.dImaginary;
        return diff;
    }

    // composition of two complex numbers cA, cB

    public Complex Multi(Complex complexB) {
        Complex prod = new Complex();
        prod.dReal = dReal * complexB.dReal - dImaginary * complexB.dImaginary;
        prod.dImaginary = dImaginary * complexB.dReal + dReal * complexB.dImaginary;
        return prod;
    }
}
