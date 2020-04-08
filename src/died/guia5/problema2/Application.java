package died.guia5.problema2;
import died.guia5.problema3.*;

public class Application {
	public static void main(String[] args) {
		Producto prod1 = new Producto("arróz", 70);
		Producto prod2 = new Producto("maiz", 50);
		Producto prod3 = new Producto("leche", 60);
		Producto prod4 = new Producto("chocolate", 120);
		Producto prod5 = new Producto("lavandina", 78);
		Producto prod6 = new Producto("fideos", 65);
		Producto prod7 = new Producto("lysoform", 100);
		Producto prod8 = new Producto("manteca", 108);
		Producto prod9 = new Producto("bolsas", 45);
		Producto prod10 = new Producto("aceite", 150);
		Producto prod11 = new Producto("atún", 89);
		
		PedidoBasico p1 = new PedidoBasico(false);
		Pedido p2 = new PedidoBasico(true); //express
		PedidoPremium p3 = new PedidoPremium();
		Pedido p4 = new PedidoPremium(); //mas de 10
		Pedido p5 = new PedidoPremium();
		
		Cadete c1 = new Cadete();
		
		p1.agregarProducto(prod1);
		p1.agregarProducto(prod2);
		p1.agregarProducto(prod3);
		p1.agregarProducto(prod4);
		p1.agregarProducto(prod5);
		p1.agregarProducto(prod6); //no se agrega
		System.out.println(p1.toString());
		System.out.println(p1.precio());
		
		p2.agregarProducto(prod1);
		p2.agregarProducto(prod2);
		p2.agregarProducto(prod3);
		p2.agregarProducto(prod4);
		p2.agregarProducto(prod5);
		System.out.println(p2.toString());
		System.out.println(p2.precio());
		
		p3.agregarProducto(prod1);
		p3.agregarProducto(prod2);
		p3.agregarProducto(prod3);
		p3.agregarProducto(prod4);
		p3.agregarProducto(prod5);
		System.out.println(p3.toString());
		System.out.println(p3.precio());
		
		p4.agregarProducto(prod1);
		p4.agregarProducto(prod2);
		p4.agregarProducto(prod3);
		p4.agregarProducto(prod4);
		p4.agregarProducto(prod5);
		p4.agregarProducto(prod6);
		p4.agregarProducto(prod7);
		p4.agregarProducto(prod8);
		p4.agregarProducto(prod9);
		p4.agregarProducto(prod10);
		p4.agregarProducto(prod11);
		System.out.println(p4.toString());
		System.out.println(p4.precio());
		System.out.println();
		
		p5.agregarProducto(prod1);
		p5.agregarProducto(prod2);
		p5.agregarProducto(prod3);
		p5.agregarProducto(prod4);
		p5.agregarProducto(prod5);
		p5.agregarProducto(prod6);
		p5.agregarProducto(prod7);
		p5.agregarProducto(prod8);
		p5.agregarProducto(prod9);
		p5.agregarProducto(prod10);
		p5.agregarProducto(prod11);
		System.out.println(p5.toString());
		System.out.println(p5.precio());
		System.out.println();
		
		//sin entregar
		c1.agregarPedido(p1);
		System.out.println(c1.comisiones()); //comision de p1
		c1.agregarPedido(p2);
		System.out.println(c1.comisiones()); //comisiones de p1 y p2 (sumados)
		c1.agregarPedido(p3);
		System.out.println(c1.comisiones()); //comisiones de p1, p2 y p3 (sumados)
		c1.agregarPedido(p4);
		System.out.println(c1.comisiones()); //comisiones de todos los pedidos (sumados)
		
		Cadete c3 = new Cadete();
		c3.agregarPedido(p5);
		System.out.println();
		System.out.println("cadete 3: "+c3.comisiones());

		
		//entrega pedidos
		System.out.println("Comisiones después de entregar los pedidos");
		c1.entregarPedido(p1); 
		System.out.println(c1.comisiones());//entregó pedido p
		c1.entregarPedido(p2);
		System.out.println(c1.comisiones());//entregó pedido p2
		c1.entregarPedido(p3);
		System.out.println(c1.comisiones());//entregó pedido p3
		c1.entregarPedido(p4);
		System.out.println(c1.comisiones()); //entregó pedido p4 y muestra la suma de todas las comisiones
		System.out.println("cadete 3: "+c3.comisiones()); //sin entregar su pedido
		c3.entregarPedido(p5);
		System.out.println("cadete 3: "+c3.comisiones()); //Entregó su pedido
	
		Tramite t1 = new Tramite("entregar papeles en el banco", "San Martin y Primera Junta");
		c1.agregarPedido(t1);
		System.out.println(c1.comisiones()); //debe ser igual
		c1.entregarPedido(t1);
		System.out.println("Luego de hacer el tramite "+c1.comisiones());
	
	
	
	
	
	}
}
