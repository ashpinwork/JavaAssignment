import java.util.Scanner;

public class InTheCart {
	Electronics e = new Electronics();
	Appliances a = new Appliances();
	Furniture f = new Furniture();
	Scanner sc = new Scanner(System.in);
	
	float total;
	int productOpt;
	
	float getDetails() {
		System.out.println("1) Appliances \n2) Furniture \n3) Electronics");
		System.out.println("Select Product Type: ");
		productOpt = sc.nextInt();
		
		if (productOpt == 1) {
			System.out.println("Appliances");
			a.display();
			a.createOrder();
			total = a.displayOrder();
			return total;
		}
		
		else if (productOpt == 2) {
			System.out.println("Furniture");
			f.display();
			f.createOrder();
			total = f.displayOrder();
			return total;
		}
		else if (productOpt == 3) {
			System.out.println("Electronics");
			e.display();
			e.createOrder();
			total = e.displayOrder();
			return total;
		}
		else {
			System.out.println("Invalid Option! Input 1 or 2 only!");
			return 0;
		}
		
	}
	
}
