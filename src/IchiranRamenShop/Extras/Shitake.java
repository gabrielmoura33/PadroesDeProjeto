package IchiranRamenShop.Extras;

import IchiranRamenShop.Pedido;
import IchiranRamenShop.Pedivel;

public class Shitake extends Pedido {
    private final Pedivel pedido;

    public Shitake(Pedivel pedido) {
        this.pedido = pedido;
    }

    @Override
    public double getValor() {
        return pedido.getValor() + 6.90;
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + " \n Extra Selecionado: \t Shitake \n ";
    }
}
