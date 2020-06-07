package IchiranRamenShop.Carnes;

import IchiranRamenShop.Pedido;
import IchiranRamenShop.Pedivel;

public class Porco extends Pedido {
    private final Pedivel pedido;

    public Porco(Pedivel pedido) {
        this.pedido = pedido;
    }

    @Override
    public double getValor() {
        return pedido.getValor() + 5.90;
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + "Carne Selecionada: \t Porco";
    }
}
