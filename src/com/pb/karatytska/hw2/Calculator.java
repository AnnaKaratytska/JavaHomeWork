package com.pb.karatytska.hw2;
import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        String sign;
        System.out.println("Введите число");
        a = scan.nextInt();
        System.out.println("Введите число");
        b = scan.nextInt();
        System.out.println("Введите действие + - * /");
        sign = scan.next();


        switch (sign) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;

            case "*":
                System.out.println(a * b);
                break;
            case "/":
                b = scan.nextInt();
            if (b!=0);{
                System.out.println(a / b);}
            else{
                System.out.println("Деление на 0 запрещено, введите другое число");}



        }
    }
}
