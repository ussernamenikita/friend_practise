package homework.task_4;

import java.util.Scanner;

public class Recursion {
    private final String GET_NUMBER = "Введите число: ";
    Scanner sc = new Scanner(System.in);

    public void exponentiation() {
        System.out.println(GET_NUMBER);
        int num = sc.nextInt();
        System.out.println("Введите степень:");
        int exp = sc.nextInt();

        int result = (int) Math.pow(num, exp);
        System.out.println(result);
    }

    private int fibbonachiRecursion(int num) {
        if (num <= 0) return 0;
        if (num == 1 || num == 2) return 1;
        return fibbonachiRecursion(num - 1) + fibbonachiRecursion(num - 2);
    }

    public void fibbonachi() {
        System.out.println("Фибоначчи. " + "\n" + GET_NUMBER);
        int num = sc.nextInt();
        System.out.println(fibbonachiRecursion(num) + 1);

    }

    public void countsNum() {
        System.out.println("Сколько цифр в числе." + "\n" + GET_NUMBER);
        int num = sc.nextInt();

        int result = String.valueOf(Math.abs(num)).length();
        System.out.println(result);
    }
}
