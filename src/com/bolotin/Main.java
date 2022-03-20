package com.bolotin;

import jdk.swing.interop.SwingInterOpUtils;



public class Main {

    public static void main(String[] args) {
	// Задача 1
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();

        int summa = 0;
        for (int i = 0; i < arr.length; i++) {
            summa = summa + arr[i];
                   }
        System.out.println("Сумма трат за месяц составила " + summa + " рублей");

        //Задача 2
        System.out.println("Задача 2");
        int maxSumma = 99999;
        int minSumma = 200001;
        for (int i: arr) {
            if (i > maxSumma) {
                maxSumma = i;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSumma + " рублей");
        for (int i: arr) {
            if (i < minSumma) {
               minSumma = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSumma + " рублей");

        //Задача 3
        System.out.println("Задача 3");

        double averageSumma = summa/30;
        System.out.println("Средняя сумма трат за день составила " + averageSumma + " рублей");

        //Задача 4
        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println(reverseFullName);
        for (int i = reverseFullName.length - 1; i < reverseFullName.length && i >= 0; i--) {

            System.out.print(reverseFullName[i]);
        }
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }

        return arr;

    }


}
