package IchiranRamenShop.Extras;

import IchiranRamenShop.Pedido;
import IchiranRamenShop.Pedivel;

public class Croutons extends Pedido {
    private final Pedivel pedido;

    public Croutons(Pedivel pedido) {
        this.pedido = pedido;
    }

    @Override
    public double getValor() {
        return pedido.getValor() + 2.00;
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + " \n Extra Selecionado: \t Croutons \n ";
    }
}
