package homework.task1;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте размеры двух массивов: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        CreateArrayChar arr = new CreateArrayChar(num1, num2);
        System.out.println("Задайте размер пирамидки: ");
        int sizPir = sc.nextInt();
        Piramidka pir = new Piramidka(sizPir);
    }

}
