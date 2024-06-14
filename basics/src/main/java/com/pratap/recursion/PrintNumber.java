package com.pratap.recursion;

public class PrintNumber {
    void print1ToN(int num){
        if(num > 0){
            print1ToN(num-1);
            System.out.print(num+" ");
        }
    }

    void printNTo1(int num){
        if(num > 0){
            System.out.print(num+" ");
            printNTo1(num-1);

        }
    }

    public static void main(String[] args) {
        PrintNumber printNumber=new PrintNumber();
        System.out.println("Printing number from N to 1");
        printNumber.print1ToN(5);
        System.out.println("\nPrinting number from 1 to N");
        printNumber.printNTo1(5);
    }
}
