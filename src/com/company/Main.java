package com.company;

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
        if (deliveryDistance > 0 && deliveryDistance < 20) {
            System.out.println("Потребуется дней 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней 2");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней 3");
        }
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
                    System.out.println("Дубликатов нет");
                    return;
                }
            }
        } task4(String dublicates = "aabccddefgghiijjkk");
    }

    //5

    public static void task5(char[] reverseFullName) {

    }
    char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
        if (i==0);
        System.out.print(reverseFullName[i]);
    }
    public static void main(String[] args) {
	// write your code here

        task1(2021);
        task2(0, 2014);
        task3(78);
        task4(String dublicates = "aabccddefgghiijjkk");
        task5(1)
    }
}
