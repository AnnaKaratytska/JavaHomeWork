package com.pb.karatytska.hw2;
import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;
        System.out.println("Введите число");
        operand1 = scan.nextInt();
        System.out.println("Введите действие + - * /");
        sign = scan.next();
        System.out.println("Введите число");
        operand2 = scan.nextInt();

                switch (sign) {
            case "+":
                System.out.println(operand1+operand2);
                break;
            case "-":
                System.out.println(operand1-operand2);
                break;

            case "*":
                System.out.println(operand1 * operand2);
                break;
            case "/":
                if (operand2 != 0) {System.out.println(operand1 / operand2);}
                else { System.out.println("Деление на 0 запрещено, введите другое число");}
            break;
        }

    }
}
