
/**
 * Write a description of class ConverterStatic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ConverterStatic {
    static final int base2 = 2;
    static final int base8 = 8;
    public static void main(String[] args) {
        int num = 0;
        String inputString = "17";
        //num = BaseToDecimal(inputString, base8);
        System.out.println(num);
        inputString = "111";
        //num = BaseToDecimal(inputString, base2);
        System.out.println(num);
    }
    
    int BaseToDecimal(String ln, int base) {
        int num = 0;
        int len = ln.length();
        for (int i = 0; i <len; i++) {
            num += Integer.parseInt(ln.substring(ln.length()-1)) * (int)Math.pow(base, i);
            ln = ln.substring(0, ln.length() - 1);
        }
        return num;
    }
}
