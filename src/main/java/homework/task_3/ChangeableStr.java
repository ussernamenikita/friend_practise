package homework.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ChangeableStr {
    Scanner sc = new Scanner(System.in);
    private final String ERR_GET_INDEX = "Ошибка! Попробуйте арабские цифры...";


    public void stringIndexGeneration() {
        ProcessedString ps = new ProcessedString();
        String textGetIndex = "Введите индекс (введите 666, что бы выйти):";
        String modifiedStr = "";
        char charByIndex;
        String str = ps.received;
        int index = 0;

        System.out.println(textGetIndex);
        while (true) {
            index = checkIndexForNumber(index);//+
            if (index == 666) break;
            index = verifyLengthIndex(str, index);
            charByIndex = str.charAt(index);
            modifiedStr = modifiedStr.concat(String.valueOf(charByIndex));
            System.out.println(modifiedStr);
        }

        System.out.println(spoofChar(str));
        System.out.println(reverseString(str));
    }

    private int checkIndexForNumber(int index) {
        while (true) {
            try {
                index = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println(ERR_GET_INDEX);
                sc.next();
            }
        }
        return index;
    }

    private int verifyLengthIndex(String str, int index) {
        String tooMany = "Слишком большое число, попробуйте не больше ";
        if (index > (str.length()) - 1) {
            while (true) {
                System.out.println(tooMany + (str.length() - 1));
                index = checkIndexForNumber(index);
                if (index == 666) break;
                if (index < (str.length())) break;
            }
        }
        return index;
    }

    private String spoofChar(String strForSpoof) {
        StringBuilder stringForSpoof = new StringBuilder(strForSpoof);
        int index1 = verifyLengthIndex(strForSpoof, getIndexForSpoof(strForSpoof));
        int index2 = verifyLengthIndex(strForSpoof, getIndexForSpoof(strForSpoof));
        char symbol1 = stringForSpoof.charAt(index1);
        char symbol2 = stringForSpoof.charAt(index2);

        stringForSpoof.setCharAt(index1, symbol2);
        stringForSpoof.setCharAt(index2, symbol1);

        String result = stringForSpoof.toString();

        return result;
    }

    private int getIndexForSpoof(String str) {
        String indexText = "Введите номер индекса для замены в строке: ";
        System.out.println(indexText);
        int index;

        while (true) {
            try {
                index = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println(ERR_GET_INDEX);
                sc.next();
            }
        }
        return index;
    }

    private String reverseString(String stringForReverse) {
        ArrayList<String> arrWords = new ArrayList<String>(Arrays
                .asList(stringForReverse.split(" ")));
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
