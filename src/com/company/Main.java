package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1");
        task1();
        System.out.println("Задача 2");
        task2(7);
        System.out.println("Задача 3");
    }

    private static void task1() {
        int count = 0;

        while (count < 10) {
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
        for (int i = 1; i <= 31; i++) {
            if (i == friday) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
                friday += 7;
            }
        }
    }

    private static void task3() {

    }
}
