package homework.task_1_2;

import java.util.Scanner;

public class EnterData {
    Scanner sc = new Scanner(System.in);

    public int gettingNumbersForSizeArray(){
        int number = 0;
        String getFirstArrNum = "Введите размер первого массива: ";
        String getNestedArrNum = "Введите размер вложенного массива: ";

        if (number == 0){
            System.out.println(getFirstArrNum);
        }else {
            System.out.println(getNestedArrNum);
        }
        number = sc.nextInt();

        return number;
    }

}
