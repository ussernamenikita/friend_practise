package homework.task_1_2;


import java.util.Random;
import java.util.Scanner;

final class CreateArrayChar {
    private static int startRange = 33;
    private static int finishRange = 94;
    private int num1;
    private int num2;

    public CreateArrayChar(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        genArray(num1, num2);
    }

    private void genArray(int num1, int num2) {
        Random random = new Random();
        char[][] array = new char[num1][num2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                char symbol = (char) (random.nextInt(finishRange) + startRange);
                array[i][j] = symbol;
            }
        }
        outputArray(array);
    }

    private void outputArray(char[][] array) {
        Strategy strat = new Strategy();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
        strat.strategy(array);
    }


    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public static int getStartRange() {
        return startRange;
    }

    public static int getFinishRange() {
        return finishRange;
    }

}

