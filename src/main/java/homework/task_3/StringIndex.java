package homework.task_3;

import java.util.Scanner;

public class StringIndex {

    public void stringIndGen(String text){
        String indextext = "Введите индекс (введите 666, что бы выйти):";
        String outputString = new String();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(indextext);
            int index = sc.nextInt();
            if (index == 666) break;
            char indexword = text.charAt(index);
            outputString = outputString.concat(String.valueOf(indexword));
            System.out.println(outputString);
        }

    }

}
