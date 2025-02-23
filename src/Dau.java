import java.util.Random;

public class Dau {
    // Afegeixo l'atribut valor
    private int valor;

    /*
    public Dau(int valor) {
        if (!(valor >= 0 && valor <= 6)) throw new IllegalArgumentException("Argument no valid");
        this.valor = valor;
    }
    */

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean equals(Dau altre) {
        return (this.valor == altre.valor);
    }

    public void tirar() {
        Random rdm = new Random();
        valor = 1 + rdm.nextInt(5);
        System.out.printf("Valor: %d\n", valor);;
    }

    @Override
    public String toString() {
        return "Dau{" +
                "valor=" + valor +
                '}';
    }
}
