package IchiranRamenShop.Tamanhos;

import IchiranRamenShop.Pedido;
import IchiranRamenShop.Pedivel;

public class Grande extends Pedido {
    private final Pedivel pedido;

    public Grande(Pedivel pedido) {
        this.pedido = pedido;
        tamanhoSelecionado = true;
    }

    @Override
    public double getValor() {
        return pedido.getValor() + 15.90;
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + "\n Tamanho: Grande \n";
    }
}
