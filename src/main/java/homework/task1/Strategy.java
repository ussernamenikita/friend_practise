package homework.task1;

public class Strategy {
    /*

     _*_*_ - 1
     *_*_* - 0         - displaying the strategy of the screen


     */

    public void strategy(char[][]arr, int num) {
        String arrToStr = new String();
        int i = num;
        for (char[] ar : arr) {
            for (char ch : ar) {
                if (i == 0) {
                    arrToStr = arrToStr.concat(String.valueOf(ch));
                    i++;
                } else i--;
            }
        }
        inputScreen(arrToStr);
    }

    private void inputScreen(String arrToStr){
        System.out.println(arrToStr);
    }
}
