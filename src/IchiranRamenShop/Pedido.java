package IchiranRamenShop;

public  class Pedido implements Pedivel {

    public boolean tamanhoSelecionado = false;

    @Override
    public double getValor() {
        return 0.00;
    }

    @Override
    public String getDescricao() {
        return "\t\t Ichiran Ramen Shop \t\t";
    }
}
