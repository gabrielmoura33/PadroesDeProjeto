package IchiranRamenShop.Bebidas;

import IchiranRamenShop.Pedido;
import IchiranRamenShop.Pedivel;

public class Refrigerante extends Pedido {
    private final Pedivel pedido;

    public Refrigerante(Pedivel pedido) {
        this.pedido = pedido;
    }

    @Override
    public double getValor() {
        return pedido.getValor() + 5.90;
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + "\n Bebida Selecionada: \t Refrigerante ";
    }
}
