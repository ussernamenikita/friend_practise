package homework.task_1_2;

public class Piramidka {

    //Имена переменных
    private int num;
    private String symbol = "*";

    public int getNum() {
        return num;
    }

    public String getSymbol() {
        return symbol;
    }

    public Piramidka(int num) {
        this.num = num;
        outputPitamidka();
    }

    //pitaminka
    //Имхо луше использовать английские слова  - outputPyramid
    private void outputPitamidka() {
        //Кажется что переменная count здесь не нужна вместо нее моэжно юать i
        int count = 0;
        for (int i = 0; i < num; i++) {
            for (int n = 0; n < num - count; n++) {
                System.out.print(symbol);
            }
            System.out.println();
            count++;
        }
    }
}
