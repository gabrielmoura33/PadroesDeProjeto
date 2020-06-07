package IchiranRamenShop.FilaDeEspera;

import IchiranRamenShop.Pedido;

import java.util.ArrayList;
import java.util.List;

public class FilaDeEspera extends Pedido{
	private List<Observer> observers = new ArrayList<Observer>();
	private List<Pedido> pedido = new ArrayList<Pedido>();
	private static int count = 0;
	public int numeroDoPedido;
	private static boolean CREATED = false;

	public FilaDeEspera(){
		if (CREATED)
			System.out.println("Só pode Haver Uma fila de Espera!");
	}


	public int getState(Pedido ped) {
		return this.pedido.indexOf(ped);
	}

	public void setState(Pedido pedido) {
		this.pedido.add(pedido);
		count ++;
		numeroDoPedido = count;
		notifyAllObservers();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}