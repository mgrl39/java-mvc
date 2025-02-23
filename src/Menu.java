import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.setOut;
/*
 * Main: Un menú per gestionar les partides, o si ho preferiu,
 * una classe Menú amb les opcions indicades com en l’exercici explicat a classe.
 */

public class Menu {
    private int[] arrayJugar = {0, 0, 0};
    private Scanner scanner = new Scanner(System.in);
    JocDaus joc;

    public Menu() {
    }

    public void jocNoDisponible() {
        System.out.printf("================================================\n");
        System.out.printf("======= funcionalitat no implementada... =======\n");
        System.out.printf("================================================\n");
    }

    public void menuPrincipal(int partidesJugades, int partidesGuanyades, int partidesPerdudes) {
        int opcio;
        do {
            System.out.printf("1. Jugar Joc Daus\n");
            System.out.printf("2. Jugar Parxís\n");
            System.out.printf("3. Jugar Tic Tac Toe\n");
            System.out.printf("4. Jugar Minecraft\n");
            System.out.printf("5. Sortir\n");
            System.out.printf("Selector de joc: ");
            opcio = scanner.nextInt();
            switch (opcio) {
                case 1:
                    joc = new JocDaus();
                    arrayJugar = menuJugar(joc, partidesJugades,partidesGuanyades, partidesPerdudes);
                    partidesJugades += arrayJugar[0];
                    partidesGuanyades += arrayJugar[1];
                    partidesPerdudes += arrayJugar[2];
                    break ;
                case 2:
                case 3:
                case 4:
                    jocNoDisponible();
                    break ;
                case 5:
                    System.out.printf("================================================\n");
                    System.out.printf("PARTIDES GUANYADES: %d\n", partidesGuanyades);
                    System.out.printf("PARTIDES PERDUDES: %d\n", partidesPerdudes);
                    System.out.printf("TOTAL: %d\n", partidesJugades);
                    System.out.printf("================================================\n");
                    exit(0);
                default:
                    System.out.printf("ERROR: Els valors disponibles son 1, 2, 3, 4 i 5\n");
            }
        } while (opcio != 5);
    }

    public int[] menuJugar(JocDaus joc, int partidesJugades, int partidesGuanyades, int partidesPerdudes) {
        int opcio;
        System.out.printf("================================================\n");
        System.out.printf("\uD83C\uDFB2 Joc Daus ====================================\n");
        do {
            System.out.printf("1. Tirar els daus\n");
            System.out.printf("2. Sortir del joc\n");
            opcio = scanner.nextInt();
            switch (opcio) {
                case 1:
                    if (joc.jugar() == 1) partidesGuanyades++;
                    else partidesPerdudes++;
                    partidesJugades++;
                case 2:
                    break;
                default:
                    System.out.printf("Les opcions disponibles son 1 i 2\n");
            }
        } while (opcio != 2);
        System.out.printf("\uD83C\uDFB2 Final del Joc Daus ===============================\n");
        int[] resultats = {partidesJugades, partidesGuanyades, partidesPerdudes};
        return (resultats);
    }
}
