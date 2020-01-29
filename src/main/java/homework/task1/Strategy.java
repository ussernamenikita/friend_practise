package homework.task1;

import java.util.Scanner;

public class Strategy {
    /*

     _*_*_ - 1
     *_*_* - 0         - displaying the strategy of the screen


     */

    private static String A = "A";
    private static String B = "B";

    public void strategy(char[][]arr, int num) {
        inputValid();
        String arrToStr = new String();
        for (char[] ar : arr) {
            for (char ch : ar) {
                if (num == 0) {
                    arrToStr = arrToStr.concat(String.valueOf(ch));
                    num++;
                } else num--;
            }
        }
        inputScreen(arrToStr);
    }

    private String inputValid() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выбере стратегию вывода на экран (A or B): ");
        String choice = sc.nextLine();
        for (int i = 0; i != 1; ) {
            if (choice.equals(A) | choice.equals(B)) i = 1;
            else {
                System.out.println("Ошибка! Наберите прописную" +
                        " букву латинского алфавита ( A or B) :");
                choice = sc.nextLine();
            }
        }
        return choice;
    }

    private void inputScreen(String arrToStr){
        System.out.println(arrToStr);
    }
}
