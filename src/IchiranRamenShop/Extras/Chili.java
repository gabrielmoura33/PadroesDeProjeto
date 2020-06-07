package IchiranRamenShop.Extras;

import IchiranRamenShop.Pedido;
import IchiranRamenShop.Pedivel;

public class Chili extends Pedido {
    private final Pedivel pedido;

    public Chili(Pedivel pedido) {
        this.pedido = pedido;
    }

    @Override
    public double getValor() {
        return pedido.getValor() + 2.50;
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + " \n Extra Selecionado: \t Chilli \n ";
    }
}
