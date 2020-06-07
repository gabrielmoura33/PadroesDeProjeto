package IchiranRamenShop.Bebidas;

import IchiranRamenShop.Pedido;
import IchiranRamenShop.Pedivel;

public class Ko_Cha extends Pedido {
    private final Pedivel pedido;

    public Ko_Cha(Pedivel pedido) {
        this.pedido = pedido;
    }

    @Override
    public double getValor() {
        return pedido.getValor() + 0.00;
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + "\n Bebida Selecionada: \t KO-Cha (Preto) ";
    }
}
