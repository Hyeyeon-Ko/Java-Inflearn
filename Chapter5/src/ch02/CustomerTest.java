package ch02;

public class CustomerTest {

	public static void main(String[] args) {

//		Customer customerLee = new Customer();
//		customerLee.setCustomerName("이순신");
//		customerLee.setCustomerId(10010);
//		customerLee.bonusPoint = 1000;
//		System.out.println(customerLee.showCustomerInfo());

		Customer customerKim = new VIPCustomer(10020, "김유");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	
	}

}