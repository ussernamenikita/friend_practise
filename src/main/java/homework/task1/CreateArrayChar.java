package homework.task1;


import java.util.Random;
import java.util.Scanner;

final class CreateArrayChar {
    private static int startRange = 33;
    private static int finishRange = 94;
    private static String A = "A";
    private static String B = "B";
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
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
        choiceStrategy(array);
    }

    private void choiceStrategy(char[][] array){
        Strategy strategy = new Strategy();
        System.out.println("Выбере стратегию вывода на экран (A or B): ");
        String chois = valid();
        if (chois.equals(A)) strategy.strategy(array,0);
        else strategy.strategy(array,1);
    }

    private String valid() {
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        for (int i = 0; i != 1; ) {
            if (choice.equals(A) | choice.equals(B)) i = 1; // непонятный баг
            else {
                System.out.println("Ошибка! Наберите прописную" +
                        " букву латинского алфавита ( A or B) :");
                choice = sc.nextLine();
            }
        }
        return choice;
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

