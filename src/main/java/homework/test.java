package homework;


public class test {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};
        int i = 1;
        for (int x[] : arr) {
            for (int y : x) {
                if (i == 0) {
                    System.out.println(y);
                    i++;
                } else i--;
            }
        }
    }

}
