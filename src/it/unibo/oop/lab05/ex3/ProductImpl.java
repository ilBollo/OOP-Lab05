package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product {

	private final String name;
	private final double quantity;
	
	
	
	public ProductImpl(final String n, final double q) {
		super();
		this.name = n;
		this.quantity = q;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public double getQuantity() {
		return this.quantity;
	}

}
