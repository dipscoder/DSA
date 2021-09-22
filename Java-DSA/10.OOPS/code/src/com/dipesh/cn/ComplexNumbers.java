package com.dipesh.cn;
// What are complex numbers - https://www.khanacademy.org/math/algebra2/x2ec2f6f830c9fb89:complex
// Problem - https://classroom.codingninjas.com/app/classroom/me/10337/content/174182/offering/2163313/problem/1004
public class ComplexNumbers {

    int realNum;
    int imaginaryNum;

    public ComplexNumbers(int realNum, int imaginaryNum){
        this.realNum = realNum;
        this.imaginaryNum = imaginaryNum;
    }

//    This function adds two given complex numbers and updates the first complex number.
    public void plus(ComplexNumbers c2){
        this.realNum = this.realNum + c2.realNum;
        this.imaginaryNum = this.imaginaryNum + c2.imaginaryNum;
    }

//    This function multiplies two given complex numbers and updates the first complex number.
    public void multiply(ComplexNumbers c2){
//        https://www.mathsisfun.com/algebra/complex-number-multiply.html
//        (a+bi)(c+di) = ac + adi + bci + bdi^2 (i^2 == -1)
//        ShortHand formula, (a+bi)(c+di) = (ac−bd) + (ad+bc)i

        int a = this.realNum;
        int b = this.imaginaryNum;
        int c = c2.realNum;
        int d = c2.imaginaryNum;

//      Updating Result In c1
        this.realNum = a*c - b*d;
        this.imaginaryNum = a*d + b*c;

    }

    public void print(){
        System.out.println(this.realNum+" + "+"i"+imaginaryNum);
    }
}
