import java.util.Scanner;

import Aggregations.Address;
import Aggregations.Name;

public class Details {
	String custID;
	int phoneNum;
	String emailID;
	float points;
	Name n = new Name();
	Address addr = new Address();
	
	Scanner sc = new Scanner(System.in);

	void getAddress() {
		System.out.println("\t Address");
		System.out.println("Locality: ");
		addr.locality = sc.next();
		System.out.println("City: ");
		addr.city = sc.next();
		System.out.println("State: ");
		addr.state = sc.next();
		System.out.println("Pin Code: ");
		addr.pinCode = sc.nextInt();
		System.out.println("Account Created Successfully! ");
		System.out.println("----------------------------");
	}
	
	void getName() {

		System.out.println("\t Personal");
		System.out.println("First Name:");
		n.fName = sc.next();
		System.out.println("Middle Name:");
		n.mName = sc.next();
		System.out.println("Last Name:");
		n.lName = sc.next();
		System.out.println("Phone Number:");
		phoneNum = sc.nextInt();
		System.out.println("Email ID: ");
		emailID = sc.next();
	}
}
