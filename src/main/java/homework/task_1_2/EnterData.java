package homework.task_1_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EnterData {
    Scanner sc = new Scanner(System.in);
    private int number = 0;
    private final String TEXT_ERR_GET_NUM = "Ошибка! Попробуйте арабские цифры...";


    public int getNumbersForSizeArray() {
        String textFirstArrNum = "Введите размер основного массива: ";
        String textNestedArrNum = "Введите размер вложенного массива: ";

        if (number == 0) {
            System.out.println(textFirstArrNum);
        } else {
            System.out.println(textNestedArrNum);
        }
        try {
            number = sc.nextInt();
        } catch (InputMismatchException e) {
            System.err.println(TEXT_ERR_GET_NUM);
            getNumbersForSizeArray(); //TODO 0 обработать ошибку с после не правильного символа
        }
        return number;
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
        int size = 0;
        System.out.println(textSizePyr);

        try {
            size = sc.nextInt();
        } catch (Exception e) {
            System.out.println(TEXT_ERR_GET_NUM);
            getNumbersForSizeArray(); //TODO 1 обработать ошибку с после не правильного символа
        }
        return size;
    }
}