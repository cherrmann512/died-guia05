package died.guia5.problema2;

import java.util.ArrayList;

public class PedidoBasico extends Pedido {
	private ArrayList<Producto> productos = new ArrayList<Producto>(5);
	private boolean express;
	
	public PedidoBasico(boolean express) {
		this.express= express;
	}
	
	@Override
	public boolean agregarProducto(Producto p) {
		if(this.productos.size()==5) {
			return false;
		}else {
			this.productos.add(p);
			return true;	
		}

	}
	@Override
	public double precio() {
		double sumaprecios= 0;
		for (Producto p : productos) {
			sumaprecios += p.getCosto();
		}
		if (express) {
			return (sumaprecios*1.05)*1.2;
		}
		else return sumaprecios*1.05;
	}
	@Override
	public double comision() {
		return this.precio()*0.1;
	}
	@Override
	public String toString() { 
		return this.productos.toString();
	}
	

}
