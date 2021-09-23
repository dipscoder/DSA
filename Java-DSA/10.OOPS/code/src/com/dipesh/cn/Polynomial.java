package com.dipesh.cn;
//Problem - https://classroom.codingninjas.com/app/classroom/me/10337/content/174182/offering/2163317/problem/615

public class Polynomial {

//    private int deg;
//    private int coe;
    DynamicArrayPoly data = new DynamicArrayPoly();


    /* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
     *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
     *  is already present in the polynomial then previous coefficient is replaced by
     *  new coefficient value passed as function argument
     */
    public void setCoefficient(int degree, int coefficient){
        //Store coefficient at respected degree(index in array)
        data.set(degree,coefficient);
    }

    // Prints all the terms(only terms with non-zero coefficients are to be printed) in increasing order of degree.
    public void print(){
        for (int i = 0;i<data.size(); i++){
            int coefficient = data.get(i);
            if(coefficient != 0){
                System.out.print(coefficient+"x"+i+" ");
            }
        }
    }


    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p2){
        int maxLength = Math.max(this.data.size(),p2.data.size());
        Polynomial result = new Polynomial();
        for (int i=0;i< maxLength;i++){
            int coe1 = this.data.get(i);
            int coe2 = p2.data.get(i);
            if(coe1 != 0 || coe2 != 0){
                int resultCoe = coe1 + coe2;
                result.data.set(i,resultCoe);
            }
        }
        return result;
    }
//
//    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p2){
        int maxLength = Math.max(this.data.size(),p2.data.size());
        Polynomial result = new Polynomial();
        for (int i=0;i< maxLength;i++){
            int coe1 = this.data.get(i);
            int coe2 = p2.data.get(i);
            if(coe1 != 0 || coe2 != 0){
                int resultCoe = coe1 - coe2;
                result.data.set(i,resultCoe);
            }
        }
        return result;
    }
//
//    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p2){
//      https://www.geeksforgeeks.org/multiply-two-polynomials-2/
        Polynomial p1 = this;
        Polynomial result = new Polynomial();
        for (int i=0;i < p1.data.size();i++){
            int coe1 = p1.data.get(i);
            if(coe1 != 0){
                for (int j=0;j<p2.data.size();j++){
                    int coe2 = p2.data.get(j);
                    if (coe2 != 0){
                        int currentValue = result.data.get(i+j) + coe1 * coe2;
                        result.data.set(i+j,currentValue);
                    }
                }
            }
        }
        return result;
    }
}
