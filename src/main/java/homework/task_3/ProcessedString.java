package homework.task_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProcessedString {
    private int num;
    private final String ERROR_STR = "Не верно, попробуйте еще раз (\"нечетная\" - 0, \"четная\" - 1): ";
    public static String received;
    Scanner sc = new Scanner(System.in);


    public void getString() {
        String textGetStr = "Введите текст: ";

        System.out.println(textGetStr);
        received = sc.nextLine();
        getSelectionNumber();
        checkNumber();
        buildStringByStrategy(received);
    }

    private void getSelectionNumber() {
        String textChoiceStrategy = "Выберите стратегию вывода:\n \"нечетная\" - 0 \n \"четная\" - 1";
        System.out.println(textChoiceStrategy);

        while (true) {
            try {
                num = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println(ERROR_STR);
                sc.next();
            }
        }
    }

    private void checkNumber() {
        if (num > 1) {
            System.out.println(ERROR_STR);
            getSelectionNumber();
        }
    }

    private void buildStringByStrategy(String received) {
        String madeString = "";
        char[] string = received.toCharArray();
        while (num < string.length) {
            madeString = madeString.concat(String.valueOf(string[num]));
            num = num + 2;
        }
        System.out.println(madeString);
    }


}

