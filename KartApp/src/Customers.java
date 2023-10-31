import java.util.Scanner;

public class Customers {

	
	Scanner sc = new Scanner(System.in);
	SignUp sup = new SignUp();
	SignIn sin = new SignIn();
	
	int getSubscription() {
		int flag;
		System.out.println("----------------------");
		System.out.println("Sign Up(1)/Sign In(2)");
		System.out.println("----------------------");
		flag = sc.nextInt();
		try {
			if (flag>2 || flag<1) {
				throw new Error("Please input 1 or 2!");
			
			}
			else {
				System.out.println("-----------------------");
				System.out.println("Creating a new account");
				System.out.println("-----------------------");

			}
		}
		
		catch (Error e) {
			System.out.println("Error in Login"+ e.getMessage());

		}
		

		return flag;
	}
	
	void checkSubscription(int check) {
		if (check == 1) {
			sup.getData();
		}
		else {
			sin.getData();
		}
		
	}
	
	void getData() {
		
	}
}
