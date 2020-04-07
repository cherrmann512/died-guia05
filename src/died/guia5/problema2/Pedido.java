package died.guia5.problema2;

import java.time.LocalDate;

public abstract class Pedido {
	
	LocalDate fechaEntrega;
	public abstract boolean agregarProducto (Producto p);
	public abstract double precio();
	public abstract double comision();
	

	

}
