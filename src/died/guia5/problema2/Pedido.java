package died.guia5.problema2;

import java.time.LocalDate;
import died.guia5.problema3.*;

public class Pedido implements Comisionable{
	protected LocalDate fechaEntrega;
	public boolean agregarProducto (Producto p) {
		return false;
	}
	public double precio() {
		return 0;
	}
	public double comision() {
		return 0;
	}
	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	

	

}
