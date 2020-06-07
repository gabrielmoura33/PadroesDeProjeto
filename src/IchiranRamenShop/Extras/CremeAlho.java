package IchiranRamenShop.Extras;

import IchiranRamenShop.Pedido;
import IchiranRamenShop.Pedivel;

public class CremeAlho extends Pedido {
    private final Pedivel pedido;

    public CremeAlho(Pedivel pedido) {
        this.pedido = pedido;
    }

    @Override
    public double getValor() {
        return pedido.getValor() + 1.50;
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + " \n Extra Selecionado: \t Crème Alho \n ";
    }
}
