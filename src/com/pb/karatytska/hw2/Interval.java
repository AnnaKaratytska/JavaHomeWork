package com.pb.karatytska.hw2;

import java.util.Scanner;

public class Interval {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Введите число от 0 до 100");
        num = scan.nextInt();
        if (num >=0 && num <=14)
            { System.out.println("Вы ввели число в промежутке от 0 до 14");}
        if (num >=15 && num <=35)
        { System.out.println("Вы ввели число в промежутке от 15 до 35");}
        if (num >=36 && num <=50)
        { System.out.println("Вы ввели число в промежутке от 36 до 50");}
        if (num >=51 && num <=100)
        { System.out.println("Вы ввели число в промежутке от 51 до 100");}
        else
        { System.out.println("Вы ввели некорректное число");}
    }}