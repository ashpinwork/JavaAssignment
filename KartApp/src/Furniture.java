import java.util.Scanner;
import Interface.Orders;
import Interface.Products;

public class Furniture implements Products, Orders{

	int itemID[] = {0, 1, 2, 3, 4};
	String furniture[] = {"Chair", "Table", "Desk"};
	float priceFurniture[] = {420f, 190f, 100f};
	
	int orderNum;
	int[] quantity = new int[100];
	int[] itemNum = new int[100];
	float itemTotal;
	float orderTotal;
	
	Scanner sc = new Scanner(System.in);	
	
	@Override
	public void display() {
		System.out.println("ID \t Item \t Price");
		for(int i=0;i<3;i++) {
			System.out.println(itemID[i]+"\t "+furniture[i]+"\t \t"+priceFurniture[i]);
		}
	}

	@Override
	public void createOrder() {
		int counter = 0;
		char ch;
		System.out.println("---------Add to Cart--------------------------");
		do {
			System.out.println("Add item to cart:");			itemNum[counter] = sc.nextInt();
			System.out.println("Enter the quantity:");
			quantity[counter] = sc.nextInt();
			System.out.println("Add to cart? (Y/N)");
			ch = sc.next().charAt(0);
			counter += 1;
		}
		while(ch=='y' || ch=='Y');
		
	}

	@Override
	public float displayOrder() {
		orderTotal = 0;
		itemTotal = 0;
		
		System.out.println("--------Your Cart----------------");
		for(int i=0;i<3;i++) {
			itemTotal = quantity[i]*priceFurniture[itemNum[i]];
			System.out.println(quantity[i]+"x "+furniture[itemNum[i]]+" : "+itemTotal);
			orderTotal += itemTotal;
			}
		System.out.println("Total Amount: "+orderTotal);
		return orderTotal;
	}
}

	
