package homework;


public class test {
    public static void main(String[] args) {
        String line = "Переверни меня";
        System.out.println(arrayReverse(line));
        System.out.println(sbReverse(line));

    }

    public static String arrayReverse(String s) {
        char[] a = s.toCharArray();
        char[] b = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            b[(a.length - 1) - i] = a[i];
        }
        return new String(b);
    }

    public static String sbReverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
