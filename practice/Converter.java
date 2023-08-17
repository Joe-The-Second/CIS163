
/**
 * Write a description of class Converter here.
 *
 * @author (sqeby607)
 * @version (v1.01)
 */
public class Converter {
    int m_base;
    public Converter(int base) {
        m_base = base;
    }
    int BaseToDecimal(String ln) {
        return BaseToDecimal(ln,m_base);
    }
    int BaseToDecimal(String ln, int base) {
        int num = 0;
        int len = ln.length();
        for (int i = 0; i < len; i++) {
            num += Integer.parseInt(ln.substring(ln.length()-1)) * (int)Math.pow(base, i);
            ln = ln.substring(0, ln.length() - 1);
        }
        return num;
    }
    public static void main(String[] args) {
        Converter c = new Converter(8);
        System.out.println(c.BaseToDecimal("17"));
    }
}
