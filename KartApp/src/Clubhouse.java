import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import Interface.Billings;

public class Clubhouse implements Billings{
	
	float billAmt;
	float delivery = 0;
	float discount = 0.35f;
	
	@Override
	public void cartBill() {
		InTheCart itc = new InTheCart();
		
		billAmt = itc.getDetails();
		
		float points = billAmt*0.9f;
		float total = (billAmt*(1-discount) + delivery);

		System.out.println("--------Billing--------");
		ZonedDateTime DateTime = ZonedDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH.mm z");
		System.out.println(formatter.format(DateTime));
		System.out.println("Delivery Charges: "+delivery);
		System.out.println("Discount: "+(discount*100)+"%");
		System.out.println("Billed Amount: "+total);
		System.out.println("Congratulations! You have earned "+points+ " KartThis points!");
		
	}
}
