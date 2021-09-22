package com.dipesh.cn;

public class FractionUse {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4,6);
        f1.print();
//        f1.increment();
//        f1.print();

        Fraction f2 = new Fraction(12,34);
        f2.print();
        f1.addTwoFractions(f2.numerator,f2.denominator);
        f1.addTwoFractions2(f2); // Passing object as parameter

        Fraction f3 = Fraction.addTwoFractions3(f1,f2); // Receiving a fraction - result fraction
        f3.print(); // Also, a simplified answer
    }
}
