package died.guia5.problema2;

public class Producto {
	
	private String descripcion;
	private double costo;
	
	public Producto(String descripcion, double precio) {
		this.descripcion = descripcion;
		this.costo = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	@Override
	public String toString() {
		return (this.descripcion + "  $"+ this.costo);
}
}
