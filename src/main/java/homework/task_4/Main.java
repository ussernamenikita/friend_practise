package homework.task_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Recursion rec = new Recursion();
        Scanner sc = new Scanner(System.in);
        int num;
        int exp;
        System.out.println("Введите число: ");
        num = sc.nextInt();
        System.out.println("Введите степень:");
        exp = sc.nextInt();
        System.out.println(rec.exponentiation(num, exp));
        System.out.println("Введите число:");
        num = sc.nextInt();
        System.out.println(rec.countsNum(num));
        System.out.println("Фибоначчи. Введите число :");
        num = sc.nextInt();
        System.out.println(rec.fibonachi(num));
    }
}
