package homework.task_1_2;

public class Piramidka {;

    public Piramidka(int num) {
        String symbol = "*";
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
