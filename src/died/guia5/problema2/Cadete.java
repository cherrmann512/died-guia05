package died.guia5.problema2;

import java.time.LocalDate;
import java.util.ArrayList;

import died.guia5.problema3.Comisionable;

public class Cadete {
	private ArrayList<Comisionable> pedidos = new ArrayList<Comisionable>();
	
	public void agregarPedido (Comisionable p) {
		this.pedidos.add(p);
	}
	
	public double comisiones() {
		double com=0;
		for (Comisionable p : pedidos) {
				com+=p.comision();
		}
		return com;
	}
	
	public void entregarPedido (Comisionable p) {
		if(this.pedidos.contains(p))
			p.setFechaEntrega(LocalDate.now());
	}
}
