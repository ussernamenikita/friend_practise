package homework.task_1_2;

import java.util.Scanner;

public class Strategy {
    //Имхо лучше перенести вверх над классом
    /*

     _*_*_ - 1
     *_*_* - 0         - displaying the strategy of the screen


     */

    //Имена переменных, мб лучше STRATEGY_A_SYMBOL = "A" ...
    private static String A = "A";
    private static String B = "B";

    public void strategy(char[][] arr) {
        String choice = inputValid();
        int num;
        if (choice.equals(A)) num = 0;
        else num = 1;

        //Тут тебе студия сама подсказывает что лучше заменить на ""
        String arrToStr = new String();
        for (char[] ar : arr) {
            //Я бы предложил обход по индексу
            //обычный for с начальным индексом num  и шагом +=2
            for (char ch : ar) {
                if (num == 0) {
                    //мб += или stringBuilder
                    arrToStr = arrToStr.concat(String.valueOf(ch));
                    num++;
                } else num--;
            }
        }
        outputScreen(arrToStr);
    }

    private String inputValid() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выбере стратегию вывода на экран (A or B): ");
        String choice = sc.nextLine();
        //Мне кажется while тут подойдет лучше
        for (int i = 0; i != 1; ) {
            if (choice.equals(A) || choice.equals(B)) i = 1;
            else {
                System.out.println("Ошибка! Наберите прописную" +
                        " букву латинского алфавита ( A or B) :");
                choice = sc.nextLine();
            }
        }
        return choice;
    }

    private void outputScreen(String arrToStr) {
        System.out.println(arrToStr);
    }
}
