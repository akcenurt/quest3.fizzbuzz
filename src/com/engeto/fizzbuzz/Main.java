package com.engeto.fizzbuzz;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 1; i <= 100; i++){

            double x = i % 3;
            double y = i % 5;

            if (x == 0 && y != 0) {
                System.out.println("Fizz");
            } else if (y == 0 && x != 0){
                System.out.println("Buzz");
            } else if (x == 0 && y == 0){
                System.out.println("FizzBuzz");
            }else{
                System.out.println(i);
            }

        }

    }
}
