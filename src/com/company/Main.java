package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1");
        task1(10);
        System.out.println("Задача 2");
        task2(3);
        System.out.println("Задача 3");
        task3(1800, 2100);
        System.out.println("Задача 4");
        task4(30);
        System.out.println("Задача 5");
        task5(8);
    }

    private static void task1(int limit) {
        int count = 0;

        while (count < limit) {
            count++;
            System.out.print(count + " ");
        }

        System.out.print("\n");

        for (;count > 0; count--) {
            System.out.print(count + " ");
        }

        System.out.print("\n");
    }

    private static void task2(int friday) {
        for (int i = friday; i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
    }

    private static void task3(int startYear, int endYear) {
        for (int i = 0; i < endYear; i += 79) {
            if (i > startYear) {
                System.out.println("Комета пролетит в " + i + " году");
            }
        }
    }

    private static void task4(int countIterations) {
        for (int i = 1; i <= countIterations; i++) {
            System.out.print(i + ": ");
            if (i%3 == 0) {
                System.out.print("ping ");
            }
            if (i%5 == 0) {
                System.out.print("pong");
            }
            System.out.print("\n");
        }
    }

    private static void task5(int limit) {
        int first = 0, second = 1;

        System.out.print(first + ", " + second );

        for (int third, i = 1; i <= limit; i++) {
            third = first + second;
            System.out.print(", " + third);
            first = second;
            second = third;
        }
    }
}
