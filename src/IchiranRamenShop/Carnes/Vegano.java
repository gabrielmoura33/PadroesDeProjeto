package IchiranRamenShop.Carnes;

import IchiranRamenShop.Pedido;
import IchiranRamenShop.Pedivel;

public class Vegano extends Pedido {
    private final Pedivel pedido;

    public Vegano(Pedivel pedido) {
        this.pedido = pedido;
    }

    @Override
    public double getValor() {
        return pedido.getValor() + 3.90;
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + "Carne Selecionada: \t Vegano";
    }
}
