package com.company;

import java.util.Arrays;

public class Main {
    //1

    public static void task1(int year) {
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else if (year % 100 != 0) {
            System.out.println("Год не является високосным");
        }
    }

    //2

    public static void task2(int system, int clientDeviceYear) {
        if (system >= 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            if (system < 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (system >= 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                if (system < 1 && clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
            }
        }
    }

    //3

    public static void task3(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance >= 0 && deliveryDistance < 20) {
            days = days;
        } System.out.println("Потребуется " + days + " дней");
        if (deliveryDistance >= 20) {
            days = days + 1;
        }
        System.out.println("Потребуется " + days + " дней");
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            days = days + 1;
        }
        System.out.println("Потребуется " + days + " дней");

    }

    //4

    public static void task4(String dublicates) {
        dublicates = "aabccddefgghiijjkk";
        char[] chars = dublicates.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int i1 = i + 1; i1 < chars.length; i1++) {
                boolean vivod = chars[i] == chars[i1];
                if (vivod) {
                    System.out.println(i1 + " символ " + chars[i1] + " в дубле");
                    return;
                }
                if (vivod) {
                    return;
                }
            }
        } System.out.println("Дубликатов нет");
    }

    //5

    public static void task5(char[] reverseFullName) {

        for (int i = 0; i < reverseFullName.length/2; i++) {
            char a = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = a;
        }
        System.out.println(reverseFullName);
    }

    public static void main(String[] args) {
	// write your code here

        task1(2021);
        task2(0, 2014);
        task3(98);
        task4(" aabccddefgghiijjkk ");
        char[] reverseFullName = {'j', 'n', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        task5(reverseFullName);

    }
}
