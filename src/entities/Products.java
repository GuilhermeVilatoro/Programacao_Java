package entities;

public class Products {
	public String Name;
	public double Price;
	public int Quantity;

	public double totalValueInStock() {
		return (Price * Quantity);
	}

	public void addProducts(int quantity) {
		Quantity += quantity;
	}	

	public void removeProducts(int quantity) {
		Quantity -= quantity;
	}

	@Override
	public String toString() {
		return Name + ", $ " + String.format("%.2f", Price) + ", " + Quantity + " units, Total: $ " +
				String.format("%.2f", totalValueInStock());
	}
}
