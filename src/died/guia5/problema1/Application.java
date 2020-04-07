package died.guia5.problema1;

public class Application {
	public static void main(String[] args) {
		Coordenada c1 = new Coordenada(0.0, 0.0);
		Coordenada c2 = new Coordenada(1, 1);
		Coordenada c3 = new Coordenada(-2, 2);
		Coordenada c4 = new Coordenada(0.0, 2);
		Coordenada c5 = new Coordenada(2, 2);
		Coordenada c6 = new Coordenada(3, -6);
		Coordenada c7 = new Coordenada(2,-2);
		
		Camino cam1 = new Camino();
		cam1.agregar(c1);
		cam1.agregar(c2);
		cam1.agregar(c3);
		cam1.agregar(c4);
		cam1.agregar(c5);
		cam1.agregar(c6);
		cam1.agregar(4,-1);
		cam1.agregar(c1);
		cam1.agregar(5,5);
		cam1.agregar(c7);
		int i=0;
		for (Coordenada c : cam1.getCoordenadas()) {
			i++;
			System.out.println(i+"  lat: "+c.getLatitud()+ "  long: " + c.getLongitud());
		}
		System.out.println(cam1.buscar(c3, c7));
	}
	
	
}
