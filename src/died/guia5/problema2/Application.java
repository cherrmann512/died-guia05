package died.guia5.problema2;

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
		
		Pedido p1 = new PedidoBasico(false);
		Pedido p2 = new PedidoBasico(true); //express
		Pedido p3 = new PedidoPremium();
		Pedido p4 = new PedidoPremium(); //mas de 10
		
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
		
		
		c1.agregarPedido(p1);
		System.out.println(c1.comisiones()); //comision de p1
		c1.agregarPedido(p2);
		System.out.println(c1.comisiones()); //comisiones de p1 y p2
		c1.agregarPedido(p3);
		System.out.println(c1.comisiones()); //comisiones de p1, p2 y p3
		c1.agregarPedido(p4);
		System.out.println(c1.comisiones()); //comisiones de todos los pedidos
		
		Cadete c3 = new Cadete();
		c3.agregarPedido(p4);
		System.out.println("\n"+ c3.comisiones());
	}
}
