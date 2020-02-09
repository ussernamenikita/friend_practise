package homework.task_1_2;

public class Pyramid {

    private final String SYMBOL = "*";

    public Pyramid() {
        outputPyramidToScreen();
    }

    private void outputPyramidToScreen() {
        EnterData ed = new EnterData();
        int count = 0;
        int size = ed.getNumberForSizePyramid();

        for (int i = 0; i < size; i++) {
            for (int n = 0; n < size - count; n++) {
                System.out.print(SYMBOL);
            }
            System.out.println();
            count++;
        }
    }
}
