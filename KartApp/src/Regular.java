import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import Interface.Billings;

public class Regular implements Billings{

	float billAmt;
	float delivery = 400;
	@Override
	public void cartBill() {

		InTheCart itc = new InTheCart();
		
		billAmt = itc.getDetails();
		
		float points = billAmt*0.2f;
		float total = (billAmt + delivery);
		
		System.out.println("--------Billing--------");
		ZonedDateTime DateTime = ZonedDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH.mm z");
		System.out.println(formatter.format(DateTime));
		System.out.println("Delivery Charges: "+delivery);
		System.out.println("This is your first purchase! You have earned "+points+ " KartThis points!");
		System.out.println("Billed Amount: "+total);
		
	}
}
