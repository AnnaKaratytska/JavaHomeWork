package com.pb.karatytska.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main (String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
    int x = rand.nextInt(101);
        System.out.println("Для выхода из игры введите 000");
        System.out.println("Введите целое число от 0 до 100: ");
    for (int counter = 1;;){
        int a = scan.nextInt();
        if (a == 000) { System.out.println("Game over"); break;}
                if (a != x) {
            counter ++;
            System.out.println("ne ugadal");
            if (a > x){
                System.out.println("Моё число меньше. Попробуй еще раз.");}
            else if (a < x ) {System.out.println("Моё число больше. Попробуй еще раз.");}
        }else if(a == x){
            System.out.println("Bingo! Ты угадал число с " + counter + " попытки");
            System.out.println("Задуманное число:"  +x);
            break;}
        }
    }

}


