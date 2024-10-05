import java.util.Locale;
public class exercicio_02 {
    public static void main(String[] args) {
        int x;
        double y;

        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);
        //Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", y);
    }
}
