
public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheAccountClass a1 = new TheAccountClass("A101", "Tan Ah Teck", 88);
		System.out.println(a1);
		TheAccountClass a2 = new TheAccountClass("A102", "Kumar");
		System.out.println(a2);
		//test getter
		System.out.println("ID: " + a1.getId());
		System.out.println("Name: " + a1.getName());
		System.out.println("Balance: " + a1.getBalance());
		//test credit and debit
		a1.credit(100);
		System.out.println(a1);
		a1.debit(50);
		System.out.println(a1);
		a1.debit(500);
		System.out.println(a1);
		//test transfer
		a1.transferTo(a2, 100);
		System.out.println(a1);
		System.out.println(a2);
	}

}
