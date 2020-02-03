package homework.task_4;

import java.util.Scanner;

public class Recursion {
    Scanner sc = new Scanner(System.in);

    public int exponentiation(int num, int exp) {
        int result;
        result = (int) Math.pow(num, exp);
        return result;
    }

    public int fibonachi(int ind) {
        if (ind <= 0) return 0;
        if (ind == 1 || ind == 2) return 1;
        return fibonachi(ind - 1) + fibonachi(ind - 2);
    }

    public int countsNum (int num){
        int result = String.valueOf(Math.abs(num)).length();
        return result;
    }
}
