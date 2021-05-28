package festagabigol;

public class Vip extends Ingresso {

    public Vip(double preco) {
        super(preco + 50);

    }

@Override
public void ImprimirValor(){

    System.out.println("Igresso VIP" + this.preco);
}

}
