package com.company;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1: ");
        int rez = 1, n = 10;
        for (int i = 0; i < n; i++) {
            rez *= 2;

        }
        System.out.println("2^" + n + " = " + rez);


        System.out.println(fac(4));
        func3();

        func4(30);

        func5();
    }


    public static Integer fac(int n)
    {
        System.out.println("Задание 2: ");
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return (result);

    }


    public static void func3() {
        System.out.println("Задание 3: ");

        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = input.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = input.nextInt();

        int sum = firstNumber + secondNumber;
        int dif = firstNumber - secondNumber;
        int mul = firstNumber * secondNumber;

        System.out.println("Сумма двух чисел равна: " + sum);
        System.out.println("Разница двух чисел равна: " + dif);
        System.out.println("Произведение двух чисел равно: " + mul);


    }


    public static void func4(double h)

    {
        System.out.println("Задание 4: ");
        double g = 9.8;

        double Result;
        Result = Math.sqrt((2 * h / g));
        System.out.println("Решение = " + Result);
    }




    public static void func5()
    {
        System.out.println("Задание 5: ");
        int a=0, c=0;
        double b=0;
        Scanner in = new Scanner (System.in);
        System.out.println("Введите длину катета : ");
        a=in.nextInt();
        System.out.println("Введите длину гипотенузы : ");
        c=in.nextInt();
        System.out.println("Катет прямоугольного треугольника равен = ");
        b=Math.sqrt(Math.pow(c,2)-Math.pow(a,2));
        System.out.println(b);

        b=in.nextDouble();




    }

}