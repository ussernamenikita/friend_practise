package homework.task1;


import java.util.Random;
import java.util.Scanner;

final class CreateArrayChar {
   private static int startRange  = 33;
   private static int finishRange = 94;
   private static String A = "A";
   private static String B = "B";
   private int num1;
   private int num2;

    public CreateArrayChar(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        genArray(num1,num2);
    }

    private void genArray(int num1, int num2){
       Random random = new Random();
       char [][] array = new char[num1][num2];
         for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                char symbol = (char) (random.nextInt(finishRange) + startRange);
                array[i][j] = symbol;
            }
         }
         outputArray(array);
         String chois = inputValid();
         if (chois.equals(A))strategyA(array);
         else strategyB(array);
    }

    private void outputArray(char[][]array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }


    private String inputValid (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Выбере стратегию вывода на экран (A or B): ");
        String choise = sc.nextLine();
        for (int i = 0; i != 1;) {
            if (choise.equals(A) | choise.equals(B)) i = 1;
            else {
                System.out.println("Ошибка! Наберите прописную" +
                        " букву латинского алфавита ( A or B) :");
                choise = sc.nextLine();
            }
        }
        return choise;
    }



    //*_*_*
    private void strategyA (char [][] array){
        int i = 0;
        String stringA = new String();
        for (char [] ar : array) {
            for (char ch : ar) {
                if (i == 0) {
                    stringA = stringA.concat(String.valueOf(ch));
                    i++;
                }else i--;
            }
        }
        System.out.println(stringA);

    }
    //_*_*_
    private void strategyB(char[][] array){
    }

    public static int getStartRange() {
        return startRange;
    }

    public static int getFinishRange() {
        return finishRange;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }


}

