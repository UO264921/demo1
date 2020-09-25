package prueba1;

public class Carrito {
	private String[] pedido;
	
	public Carrito(String[] pedidoP) {
		this.setPedido(pedidoP);
	}

	public String[] getPedido() {
		return pedido;
	}

	public void setPedido(String[] pedido) {
		this.pedido = pedido;
	}
}
