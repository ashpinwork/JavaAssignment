
public class SignUp extends Details{
	
	Regular r = new Regular();
	
	void getData() {
		getName();
		getAddress();
		System.out.println("--------Regular USER--------");
		r.cartBill();
	}
	
}
