package IchiranRamenShop.Carnes;

import IchiranRamenShop.Pedido;
import IchiranRamenShop.Pedivel;

public class Boi extends Pedido {
    private final Pedivel pedido;

    public Boi(Pedivel pedido) {
        this.pedido = pedido;
    }

    @Override
    public double getValor() {
        return pedido.getValor() + 7.90;
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + "Carne Selecionada: \t Boi ";
    }
}
