package IchiranRamenShop.Tamanhos;

import IchiranRamenShop.Pedido;
import IchiranRamenShop.Pedivel;

public class Pequeno extends Pedido {
    private final Pedivel pedido;

    public Pequeno(Pedivel pedido) {
        this.pedido = pedido;
        tamanhoSelecionado = true;
    }

    @Override
    public double getValor() {
        return pedido.getValor() + 9.90;
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + "\n Tamanho: Pequeno \n";
    }
}
