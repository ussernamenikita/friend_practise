package homework.task_1_2;

import java.util.Random;
import java.util.Scanner;

final class CreateArrayChar {
    private static int startRange = 33;
    private static int finishRange = 94;

    public CreateArrayChar() {
        genArray();
    }

    private void genArray() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num1 = 0;
        int num2 = 0;
        System.out.println("Задайте размеры двух массивов: ");
        try {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        } catch (Exception e) {
            genArray();
        }
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


    public static int getStartRange() {
        return startRange;
    }

    public static int getFinishRange() {
        return finishRange;
    }

}

