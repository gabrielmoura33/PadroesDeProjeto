package IchiranRamenShop.Extras;

import IchiranRamenShop.Pedido;
import IchiranRamenShop.Pedivel;

public class Tofu extends Pedido {
    private final Pedivel pedido;

    public Tofu(Pedivel pedido) {
        this.pedido = pedido;
    }

    @Override
    public double getValor() {
        return pedido.getValor() + 2.70;
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + " \n Extra Selecionado: \t Tofu \n ";
    }
}
