
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    static Operation op = new Operation();
    static ArabicToRoman ar = new ArabicToRoman();
    static RomanToArabic ra = new RomanToArabic();

    public static void main(String[] args) {

        String str = "";
        String[] array = new String[5];
        int result = -1;

        System.out.println("Введите строку:");
        try {
            str = new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        array = str.split(" ");
        if ((array[0].matches("\\d{1}") || array[0].equals("10"))
                && (array[2].matches("\\d{1}") || array[2].equals("10"))) {
            result = op.operation(Integer.parseInt(array[0]), Integer.parseInt(array[2]), array[1]);
            System.out.println(result);
            return;
        }
        if (array[0].matches("[IVXLC]*")
                && array[2].matches("[IVXLC]*")) {
            result = op.operation(ra.conversion(array[0]), ra.conversion(array[2]), array[1]);
            System.out.println(ar.conversion(result));
            return;
        }
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Неверные операнды");
        }
    }
}

