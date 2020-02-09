package homework.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringIndex {
    int index;
    Scanner sc = new Scanner(System.in);


    public void stringIndGen(String text) {
        String indextext = "Введите индекс (введите 666, что бы выйти):";
        String outputString = "";
        char indexChar;
        while (true) {
            System.out.println(indextext);
            index = sc.nextInt();
            if (index > (text.length() - 1)) verifyIndex(text);
            if (index == 666) break;
            indexChar = text.charAt(index);
            outputString = outputString.concat(String.valueOf(indexChar));
            System.out.println(outputString);
        }
        System.out.println(spoofChar(text));
        System.out.println(reverseString(text));
    }

    private void verifyIndex(String text) {
        String tooMany = "Слишком большое число, попробуйте не больше ";
        while (true) {
            System.out.println(tooMany + (text.length() - 1));
            index = sc.nextInt();
            if (index == 666) break;
            if (index < (text.length())) break;
        }
    }

    /**
     *
     * @param text
     * @return
     */
    private String spoofChar(String text) {
        StringBuilder stringForSpoof = new StringBuilder(text);
        Scanner sc = new Scanner(System.in);
        String indexText = "Введиту два номера индекса для замены в строке: ";
        System.out.println(indexText);
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        char symbol1 = stringForSpoof.charAt(index1);
        char symbol2 = stringForSpoof.charAt(index2);
        stringForSpoof.setCharAt(index1, symbol2);
        stringForSpoof.setCharAt(index2, symbol1);
        String result = stringForSpoof.toString();
        return result;
    }

    private String reverseString(String text) {
        ArrayList<String> arrWords = new ArrayList<String>(Arrays
                .asList(text.split(" ")));
        StringBuilder reverse;
        String result = new String();
        String space = " ";
        for (int i = 0; i < arrWords.size(); i++) {
            reverse = new StringBuilder(reverseWord(arrWords.get(i)));
            arrWords.set(i, reverse.toString());
            result = result.concat(arrWords.get(i));
            result = result.concat(space);
        }

        return result;
    }

    private StringBuilder reverseWord(String word) {
        StringBuilder sb = new StringBuilder(word).reverse();
        return sb;
    }

}
