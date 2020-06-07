package IchiranRamenShop.Extras;

import IchiranRamenShop.Pedido;
import IchiranRamenShop.Pedivel;

public class CarneExtra extends Pedido {
    private final Pedivel pedido;

    public CarneExtra(Pedivel pedido) {
        this.pedido = pedido;
    }

    @Override
    public double getValor() {
        return pedido.getValor() + 4.00;
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + "\n Extra Selecionado: \t Carne Extra \n ";
    }
}
