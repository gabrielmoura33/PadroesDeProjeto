package IchiranRamenShop.Tamanhos;

import IchiranRamenShop.Pedido;
import IchiranRamenShop.Pedivel;

public class Medio extends Pedido {
    private final Pedivel pedido;

    public Medio(Pedivel pedido) {
        this.pedido = pedido;
        tamanhoSelecionado = true;
    }

    @Override
    public double getValor() {
        return pedido.getValor() + 12.90;
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + "\n Tamanho: Medio \n";
    }
}
