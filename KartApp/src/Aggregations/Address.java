package Aggregations;

public class Address {
	public String locality;
	public String city;
	public String state;
	public int pinCode;
	
	
	public Address() {
		
	}
	
	public Address(String locality, String city, String state, int pinCode) {
		this.locality = locality;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	
}
