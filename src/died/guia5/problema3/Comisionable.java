package died.guia5.problema3;

import java.time.LocalDate;

public interface Comisionable {
	public double comision();

	public void setFechaEntrega(LocalDate now);

}
