package prueba1;

public class Carrito {
	private String[] pedido;
	private double precio;
	
	public Carrito(String[] pedidoP) {
		this.setPedido(pedidoP);
		setPrecio(4);
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String[] getPedido() {
		return pedido;
	}

	public void setPedido(String[] pedido) {
		this.pedido = pedido;
	}
}
