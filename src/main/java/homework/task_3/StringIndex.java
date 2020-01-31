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
        spoofWord(text);
        reverseWord(text);
    }

    private void spoofWord(String text){
        StringBuilder stringB = new StringBuilder(text);
        Scanner sc = new Scanner(System.in);
        String indexText = "Введиту два номера индекса для замены в строке: ";
        System.out.println(indexText);
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        char symbol1= stringB.charAt(index1);
        char symbol2 = stringB.charAt(index2);
        stringB.setCharAt(index1,symbol2);
        stringB.setCharAt(index2,symbol1);
        System.out.println(stringB);
    }

    private void reverseWord(String text){
        String rightPart;
        String leftPart;
        int lenght = text.length();
    }
}
