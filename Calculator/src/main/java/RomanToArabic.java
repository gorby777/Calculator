
public class RomanToArabic {

    public RomanToArabic() {
    }

    int conversion(String roman) {
        roman = roman.toUpperCase();
        int a = roman.length() - 1;
        int[] array = new int[a+1];
        for (int i = a; i >= 0; i--) {
            switch (roman.charAt(i)) {
                case 'C':
                    array[i] = 100;
                    break;
                case 'L':
                    array[i] = 50;
                    break;
                case 'X':
                    array[i] = 10;
                    break;
                case 'V':
                    array[i] = 5;
                    break;
                case 'I':
                    array[i] = 1;
                    break;
                default:
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        System.out.println("Неверный символ");
                    }
            }
            if (i < a) {
                if (array[i] < array[i + 1]) {
                    array[i] *= -1;
                }
                array[a] += array[i];
            }
        }
        return array[a];
    }
}
