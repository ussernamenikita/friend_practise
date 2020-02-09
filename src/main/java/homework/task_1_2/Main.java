package homework.task_1_2;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CreateArrayChar arr = new CreateArrayChar();
        System.out.println("Задайте размер пирамидки: ");
        int sizPir = sc.nextInt();
        Piramidka pir = new Piramidka(sizPir);
    }

}
