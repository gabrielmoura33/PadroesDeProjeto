package IchiranRamenShop.Bebidas;

import IchiranRamenShop.Pedido;
import IchiranRamenShop.Pedivel;

public class O_Cha extends Pedido {
    private final Pedivel pedido;

    public O_Cha(Pedivel pedido) {
        this.pedido = pedido;
    }

    @Override
    public double getValor() {
        return pedido.getValor() + 3.90;
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + "Bebida Selecionada: \t O-Cha (Verde) ";
    }
}
