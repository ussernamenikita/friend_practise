package homework.task_4;

import java.util.Scanner;

public class Recursion {
    Scanner sc = new Scanner(System.in);

    public int exponentiation() {
        int num;
        int exp;
        int result;
        System.out.println("Введите число: ");
        num = sc.nextInt();
        System.out.println("Введите степень:");
        exp = sc.nextInt();
        result = (int) Math.pow(num, exp);
        return result;
    }

    public int countsNum (){
        int num;
        int result;
        System.out.println("Введите число:");
        num = sc.nextInt();


        return result;
    }
}
