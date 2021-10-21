package com.pb.karatytska.hw3;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
                int[] array = new int[10];
                array[0] = 1;
                array[1] = 2;
                array[2] = -3;
                array[3] = 4;
                array[4] = 5;
                array[5] = 6;
                array[6] = 7;
                array[7] = 8;
                array[8] = -9;
                array[9] = 10;

                for (int i = 0; i < array.length; ++i)
                    System.out.print(" " + array[i]);
                System.out.print(" \n");

                int sum = 0;
                for (int num : array) {
                    sum = sum + num;
                }
                System.out.println("Сумма элементов массива равна: " + sum);

                int pos = 0;
                int neg = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] < 0) {
                        neg++;
                    } else {
                        pos++;
                    }
                }
                System.out.println("Положительных элементов: " + pos);
                bubbleSort(array);
                System.out.println("Массив после пузырьковой сортировки : " + Arrays.toString(array));
            }


            public static void bubbleSort(int[] num) {
                int j;
                boolean flag = true;
                int temp;
                while (flag) {
                    flag = false;
                    for (j = 0; j < num.length - 1; j++) {
                        if (num[j] > num[j + 1]) {
                            temp = num[j];
                            num[j] = num[j + 1];
                            num[j + 1] = temp;
                            flag = true;
                        }
                    }
                }
            }
        }

