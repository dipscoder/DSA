package com.dipesh.cn;

public class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        simply();
    }
    private void simply(){
        int smallest = Math.min(this.numerator,this.denominator);
        int gcd = 1;
        for (int i = 2;i<=smallest;i++){
            if(numerator%i==0 && denominator%i==0){
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }
    public void increment(){
//        num/deno + 1 = (num + deno)/deno
        numerator = numerator + denominator;
        simply();
    }

    public void addTwoFractions(int c,int d){
//      a/b + c/d = (ad + bc)/(bd)
        int a = this.numerator;
        int b = this.denominator;
        
        int resultNum = a*d + b*c;
        int resultDen = b*d;
        System.out.println(a+"/"+b+" + "+c+"/"+d+" = "+resultNum+"/"+resultDen);
    }

    public void addTwoFractions2(Fraction f2){
//      a/b + c/d = (ad + bc)/(bd)

        int resultNum = this.numerator*f2.denominator + this.denominator*f2.numerator;
        int resultDen = this.denominator * f2.denominator;
        System.out.println("Result from Fuc2 = "+resultNum+"/"+resultDen);
    }

//    Here we will return the Object, and we can make it static
    public static Fraction addTwoFractions3(Fraction f1, Fraction f2){
//      a/b + c/d = (ad + bc)/(bd)

        int resultNum = f1.numerator*f2.denominator + f1.denominator*f2.numerator;
        int resultDen = f1.denominator * f2.denominator;

//      Bonus - it will simply the ans also
        Fraction f3 = new Fraction(resultNum,resultDen);
        return f3;
    }

    public void print(){
        System.out.println(this.numerator+"/"+this.denominator);
    }

}
