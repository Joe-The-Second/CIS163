
/**
 * Write a description of class Formater here.
 *
 * @author (sqeby607)
 * @version (v1.01)
 */
public class Formater {
    public static void main(String[] args) {
        int num = 12;
        float fnum = 11.3f;
        double dnum = 3.5;
        System.out.println(String.format("%d",num));
        System.out.println(String.format("%.2f",fnum));
    }
}
