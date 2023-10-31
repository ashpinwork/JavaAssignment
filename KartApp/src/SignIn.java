import java.util.Scanner;

public class SignIn {
	String userName;
	
	Scanner sc = new Scanner(System.in);
	Prime p = new Prime();
	Clubhouse c = new Clubhouse();
	
	void getData() {
		System.out.println("Username: ");
		userName = sc.next();
		
		if (userName.toUpperCase().startsWith("P")) {
			System.out.println("--------PRIME USER--------");
			p.cartBill();
		}
		else if (userName.toUpperCase().startsWith("C")) {
			System.out.println("--------CLUBHOUSE USER--------");
			c.cartBill();
		}
		else {
			System.out.println("Customer ID error!");

		}
	}
	
}
