public class Main {

	public static void main(String[] args) {
		Product p1 = new Product("p1",100,30);
		p1.getProductDetail();
		p1.sell(10);
		System.out.println(p1.getTotalSold());
		
		Product p2 = new Product("p2",200,20);
		p2.getProductDetail();
		p2.sell(21);
		System.out.println(p2.getTotalSold());
	}

}
class Product{
	private String name;
	private double price;
	private int quantity;
	private static int totalSold = 0;
	void sell(int quantity) {
		if((this.quantity-quantity)>=0) {
			totalSold = quantity;
			this.quantity -= quantity;
		}else {
			System.out.println("Can't sell product because of low quantity");
		}
	}
	static int getTotalSold() {
		return totalSold;
	}
	Product(String name, double price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public void getProductDetail() {
		System.out.println(name + " " + price + " " + quantity);
	}
}
