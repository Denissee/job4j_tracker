package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public int multiply(int a) {
        return x * a;
    }

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return  y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int f) {
        return sum(f) + multiply(f) + minus(f) + divide(f);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        Calculator calc = new Calculator();
        int rls = calc.multiply(5);
        System.out.println(rls);
        int fin = Calculator.minus(11);
        System.out.println(fin);
        Calculator separate  = new Calculator();
        int end = separate.divide(37);
        System.out.println(end);
        Calculator all = new Calculator();
        int allll = all.sumAllOperation(3);
        System.out.println("Итого:" + allll);
    }
}
