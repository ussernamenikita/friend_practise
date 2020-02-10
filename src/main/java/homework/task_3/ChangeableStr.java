package homework.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ChangeableStr {
    Scanner sc = new Scanner(System.in);


    public void stringIndGen() {
        String modifiedStr = "";
        char charByIndex;
        ProcessedString ps = new ProcessedString();
        String str = ps.received;
        int index = 0;

        while (true) {
            index = checkIndex(index);
            if (index == 666) break;
            if (index > (str.length())) index = verifyLengthIndex(str, index);
            charByIndex = str.charAt(index);
            modifiedStr = modifiedStr.concat(String.valueOf(charByIndex));
            System.out.println(modifiedStr);
        }

        System.out.println(spoofChar(str));
        System.out.println(reverseString(str));
    }

    private int checkIndex(int index) {
        String textGetIndex = "Введите индекс (введите 666, что бы выйти):";
        String errGetIndex = "Ошибка! Попробуйте арабские цифры...";

        System.out.println(textGetIndex);
        while (true) {
            try {
                index = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println(errGetIndex);
                sc.next();
            }
        }
        return index;
    }

    private int verifyLengthIndex(String str, int index) {
        String tooMany = "Слишком большое число, попробуйте не больше ";
        while (true) {
            System.out.println(tooMany + (str.length() - 1));
            index = sc.nextInt();
            if (index == 666) break;
            if (index < (str.length())) break;
        }
        return index;
    }

    //todo 1 обработать ошибку (String index out of range)
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
