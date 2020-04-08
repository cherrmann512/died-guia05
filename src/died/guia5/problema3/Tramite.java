package died.guia5.problema3;

import java.time.LocalDate;
import java.time.LocalTime;

public class Tramite implements Comisionable{
	private String descripcion;
	private String direccion;
	private LocalDate fechaEntrega;
	private LocalTime horario;
	private final double costo=50;
	
	public Tramite() {
		super();
	}
	public Tramite(String descripcion, String direccion) {
		this.descripcion = descripcion;
		this.direccion = direccion;
	}
	
	@Override
	public double comision() {
		if(fechaEntrega!=null) {
			return 20;
		}
		else return 0;
	}
	
	public void setFechaEntrega(LocalDate now) {
		this.fechaEntrega = now;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}
	public double getCosto() {
		return costo;
	}
	

}
