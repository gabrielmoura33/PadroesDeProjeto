package IchiranRamenShop.FilaDeEspera;

public class Cliente extends Observer {
    public Cliente(FilaDeEspera filaDeEspera) {
        this.filaDeEspera = filaDeEspera;
        this.filaDeEspera.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Pedido "+ filaDeEspera.numeroDoPedido + " Está Pronto!");
    }
}
