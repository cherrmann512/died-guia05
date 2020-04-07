package died.guia5.problema1;

public class Coordenada {
	private double latitud;
	private double longitud;
	
	public Coordenada() {
		this.latitud=0.0;
		this.longitud=0.0;
	}
	public Coordenada(double latitud, double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	public double getLatitud() {
		return latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Coordenada && this.latitud == ((Coordenada)obj).latitud
				&& this.longitud == ((Coordenada)obj).longitud) {
			return true;
		}
		else return false;
	}
	@Override
	public String toString() {
		return "latitud: " +this.latitud + " Longitid: " +this.longitud+ "\n";
	}
	

}
