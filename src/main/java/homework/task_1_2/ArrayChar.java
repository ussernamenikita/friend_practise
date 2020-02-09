package homework.task_1_2;

import java.util.Random;

final class ArrayChar {
    private final int START_RANGE = 33;
    private final int FINISH_RANGE = 94;
    EnterData ed = new EnterData();

    public ArrayChar() {
        getSizeArrays();
    }


    private void getSizeArrays() {
        int size = ed.getNumbersForSizeArray();
        int size1 = ed.getNumbersForSizeArray();
        char[][] array = new char[size][size1];

        completionArray(array);
    }

    private void completionArray(char[][] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                char symbol = (char) (random.nextInt(FINISH_RANGE) + START_RANGE);
                array[i][j] = symbol;
            }
        }
        outputArrayToScreen(array);
    }

    private void outputArrayToScreen(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
        outputStringByStrategy(array);
    }

    private void outputStringByStrategy(char[][] arr) {
        String choice = ed.choiceStrategyOutput();
        String arrToStr = "";
        int num = numberCycle(choice);

        for (char[] ar : arr) {
            for (char ch : ar) {
                if (num == 0) {
                    arrToStr = arrToStr.concat(String.valueOf(ch));
                    num++;
                } else {
                    num--;
                }
            }
        }
        System.out.println(arrToStr);
    }

    private int numberCycle(String choice) {
        String checkSymbol = "A";
        int num = 0;
        if (choice.equals(checkSymbol)) num = 1;
        return num;
    }


}

