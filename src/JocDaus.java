import java.util.Scanner;

public class JocDaus {
    private Scanner scanner = new Scanner(System.in);
    private Dau primerDau;
    private Dau segonDau;
    private Dau tercerDau;

    public JocDaus() {
        primerDau = new Dau();
        segonDau = new Dau();
        tercerDau = new Dau();
    }

    public int jugar() {
        System.out.printf("================================================\n");
        primerDau.tirar();
        segonDau.tirar();
        tercerDau.tirar();
        if (primerDau.equals(segonDau) && segonDau.equals(tercerDau))  System.out.printf("HAS GUANYAT!!\n");
        else System.out.printf("HAS PERDUT...\n");
        System.out.printf("================================================\n");
        return (primerDau.equals(segonDau) && segonDau.equals(tercerDau) ? 1 : 0);
    }
}
