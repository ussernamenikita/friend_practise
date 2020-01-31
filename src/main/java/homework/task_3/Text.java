package homework.task_3;

import java.util.Scanner;

public class Text {
    String text = "Введите текст: ";
    String text1 = "Выберите стратегию вывода:\n \"нечетная\" - 0 \n \"четная\" - 1";
    String text2 = "Не верно, попробуйте еще раз (\"нечетная\" - 0, \"четная\" - 1): ";
    String finalString = new String();
    int num;

    public void inputText() {
        Scanner sc = new Scanner(System.in);
        System.out.println(text);
        String received = sc.nextLine();
        System.out.println(text1);
        num = sc.nextInt();
        while (num > 1){
            System.out.println(text2);
            num = sc.nextInt();
        }
        buildString(received);
    }

    private void buildString(String received) {
        char[] string = received.toCharArray();
        int count = num;
        while (count < string.length) {
            finalString = finalString.concat(String.valueOf(string[count]));
            count = count + 2;
        }
        System.out.println(finalString);
    }


}

