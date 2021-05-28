package festagabigol;

public class Normal extends Ingresso {

    public Normal(double preco) {
        super(preco);

    }

    @Override
    public void ImprimirValor() {

        System.out.println("valor do ingresso: " + this.preco);

    }

    public void mostrarIngresso() {
        System.out.println("- Ingresso normal -");

    }
}
