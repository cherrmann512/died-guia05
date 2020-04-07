package died.guia5.problema1;

import java.util.ArrayList;
import java.util.List;


public class Camino {
	private ArrayList<Coordenada> coordenadas = new ArrayList<Coordenada>();
	
	public void agregar(Coordenada x) {
		this.coordenadas.add(x);

	}
	
	public void agregar(double lat, double lng) {
		this.coordenadas.add(new Coordenada(lat,lng));
	}
	
	public double sumarMtsLat (int mts) {
		double pi= Math.PI;
		double rTierra = 6378;
		double metroGrados = (1 / ((2 * pi / 360) * rTierra)) / 1000;
		double lat = this.coordenadas.get(this.coordenadas.size()-1).getLatitud() + mts * metroGrados;
		return lat;
	}
	
	public double sumarMtsLng (int mts) {
		double pi= Math.PI;
		double rTierra = 6378;
		double metroGrados = (1 / ((2 * pi / 360) * rTierra)) / 1000;
		double lng = this.coordenadas.get(this.coordenadas.size()-1).getLongitud() + (mts * metroGrados)/ Math.cos(pi/180);
		return lng;
	}
	
	public void agregar (int mtsLt, int mtsLn) {
		double lat = sumarMtsLat(mtsLt);
		double lng = sumarMtsLng(mtsLn);
		Coordenada x = new Coordenada(lat,lng);
		this.coordenadas.add(x);
	}
	
	public List<Coordenada> buscar (Coordenada no, Coordenada se){
		List<Coordenada> aux = new ArrayList<Coordenada>();
		for (Coordenada c : this.coordenadas) {
			if(c.getLatitud() >= no.getLatitud() && c.getLongitud() <= no.getLongitud() &&
			c.getLatitud()<= se.getLatitud() && c.getLongitud()>=se.getLongitud()){
				aux.add(c);
			}
		}
		return aux;
	}
	public List<Coordenada> buscar(Coordenada aux, int mts){
		double latNo = aux.getLatitud() - sumarMtsLat(mts);
		double lngNo = aux.getLongitud() + sumarMtsLng(mts);
		double latSe = aux.getLatitud() + sumarMtsLat(mts);
		double lngSe = aux.getLongitud() - sumarMtsLng(mts);
		Coordenada no = new Coordenada(latNo, lngNo);
		Coordenada se = new Coordenada(latSe, lngSe);
		return buscar(no,se);
	}
	
	public ArrayList<Coordenada> getCoordenadas() {
		return coordenadas;
	}
}