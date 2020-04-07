package died.guia5.problema2;

import java.time.LocalDate;
import java.util.ArrayList;

public class PedidoPremium extends Pedido{
	private ArrayList<Producto> productos = new ArrayList<Producto>(20);

	@Override
	public boolean agregarProducto(Producto p) {
		if(this.productos.size()==20) {
			return false;
		}else {
			this.productos.add(p);
			return true;
		}
	}

	@Override
	public double precio() {
		double sumaprecios=0;
		for (Producto p : productos) {
			sumaprecios+=p.getCosto();
		}
		if (this.productos.size()<=5) {
			return sumaprecios*1.2;
		}
		else return sumaprecios*1.3;
		
	}

	@Override
	public double comision() {
		if(this.fechaEntrega != null) {
			if(this.productos.size()>= 10) {
				return this.precio()*0.15 +50;
			}
			else return this.precio()*0.15;
		}else return 0;
	}
	
	@Override
	public String toString() { 
		return this.productos.toString();
	}
	
}
