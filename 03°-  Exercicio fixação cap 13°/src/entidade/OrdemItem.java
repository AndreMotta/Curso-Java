package entidade;

public class OrdemItem {

	private Integer quantity;
	private Double price;
	
	private Produto produto;
	
	public OrdemItem() {
	}

	public OrdemItem(Integer quantity, Double price, Produto produto) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.produto = produto;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Produto getProduct() {
		return produto;
	}

	public void setProduct(Produto produto) {
		this.produto = produto;
	}
	
	public double subTotal() {
		return price * quantity;
	}	
	
	@Override
	public String toString() {
		return getProduct().getName()
				+ ", $"
				+ String.format("%.2f", price)
				+ ", Quantity: "
				+ quantity
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
}