package homework.task_1_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EnterData {
    Scanner sc = new Scanner(System.in);
    private int size = 0;
    private final String TEXT_ERR_GET_NUM = "Ошибка! Попробуйте арабские цифры...";


    public int getNumbersForSizeArray() {
        outputTextForGetSize();

        while (true) {
            try {
                size = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.err.println(TEXT_ERR_GET_NUM);
                sc.next();
            }
        }
        return size;
    }

    private void outputTextForGetSize() {
        String textFirstArrNum = "Введите размер основного массива: ";
        String textNestedArrNum = "Введите размер вложенного массива: ";

        if (size == 0) {
            System.out.println(textFirstArrNum);
        } else {
            System.out.println(textNestedArrNum);
        }
    }

    public String choiceStrategyOutput() {
        String choice;
        String choiceTextMessage = "Выбере стратегию вывода на экран (A or B): ";
        String errTextMessage = "Ошибка! Наберите прописную букву латинского алфавита ( A or B) :";
        String strategyA = "A";
        String strategyB = "B";

        System.out.println(choiceTextMessage);
        choice = sc.nextLine();
        while (true) {
            choice = sc.nextLine();
            if (choice.equals(strategyA) || choice.equals(strategyB)) {
                break;
            } else {
                System.out.println(errTextMessage);
            }
        }
        return choice;
    }

    public int getNumberForSizePyramid() {
        String textSizePyr = "Введите размер пирамидки: ";
        int size;
        System.out.println(textSizePyr);

        while (true) {
            try {
                size = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.err.println(TEXT_ERR_GET_NUM);
                sc.next();
            }
        }
        return size;
    }
}