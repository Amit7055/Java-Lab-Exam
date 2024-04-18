package assignment_Q2;

public class ProductTest {

	public static void main(String[] args) {
		Product product1 = new Product(123, 15);
		Product product2 = new Product(456, 20);
		Product product3 = new Product(789, 25);
		System.out.println("=========================================");
		product1.dicount();
		product1.display();
		System.out.println("=========================================");
		product2.dicount();
		product2.display();
		System.out.println("=========================================");
		product3.dicount();
		product3.display();
		System.out.println("=========================================");
	}

}
