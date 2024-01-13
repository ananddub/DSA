import java.util.Arrays;

public class CountTotalLength {
    static void count(String arr) {

        String ch = "";
        for (char c : arr.toCharArray()) {
            if (!ch.contains("" + c)) {
                ch += c;
            }
        }
        int[] cn = new int[ch.length()];
        for (char c : arr.toCharArray()) {
            int index = ch.indexOf("" + c);
            cn[index] += 1;
        }
        System.out.println(Arrays.toString(ch.toCharArray()));
        System.out.println(Arrays.toString(cn));

    }

    public static void main(String[] arg) {
        String name = "hello world";
        count(name);
    }
}
