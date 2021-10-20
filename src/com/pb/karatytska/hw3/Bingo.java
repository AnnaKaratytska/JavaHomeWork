package com.pb.karatytska.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main (String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
    int Bingo = rand.nextInt(101);
        System.out.println("Для выхода из игры введи -1");
        System.out.println("Введи целое число от 0 до 100: ");
    for (int counter = 1;;){
        int User = scan.nextInt();
        if (User == -1) { System.out.println("Game over");break;}
        if (User != Bingo) {
            counter ++;
            System.out.println("ne ugadal");
            if (User > Bingo){
                System.out.println("Моё число меньше. Попробуй еще раз.");}
            else if (User < Bingo ) {System.out.println("Моё число больше. Попробуй еще раз.");}
        }else if(User == Bingo){
            System.out.println("Bingo! Ты угадал число с " + counter + " попытки");
            System.out.println("Задуманное число:"  +Bingo);
            break;}
        }
    }

}


