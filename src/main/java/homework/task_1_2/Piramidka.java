package homework.task_1_2;

public class Piramidka {

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

    private void outputPitamidka() {
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
