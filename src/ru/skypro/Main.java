package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        // Задача 2
        int clientDeviceYear = 2016;
        int deviceOS = 1;
        if (clientDeviceYear < 2015 && deviceOS == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            if (clientDeviceYear >= 2015 && deviceOS == 1) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientDeviceYear < 2015 && deviceOS == 0) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientDeviceYear >= 2015 && deviceOS == 0) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        // Задача 3
        int year = 2020;
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (isLeapYear) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }
        // Задача 4
        int deliveryDistance = 95;
        int addedDeliveryTime = 0;
        if (deliveryDistance <= 20) {
            addedDeliveryTime += 1;
            System.out.println("Потребуется дней:" + addedDeliveryTime);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            addedDeliveryTime += 2;
            System.out.println("Потребуется дней:" + addedDeliveryTime);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            addedDeliveryTime += 3;
            System.out.println("Потребуется дней:" + addedDeliveryTime);;
        } else
            System.out.println("извините, доставка только в пределах МКАДа");

            // Задача 5
            int monthNumber = 13;
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Нет такого месяца!");
            }
        }
    }


