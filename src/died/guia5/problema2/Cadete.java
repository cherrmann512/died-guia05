package died.guia5.problema2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cadete {
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	
	public void agregarPedido (Pedido p) {
		this.pedidos.add(p);
	}
	public double comisiones() {
		double com=0;
		for (Pedido p : pedidos) {
				com+=p.comision();
		}
		return com;
	}
	public void entregarPedido (Pedido p) {
		if(this.pedidos.contains(p))
			p.setFechaEntrega(LocalDate.now());
	}

}
