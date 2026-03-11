
public class TestInvoiceItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 InvoiceItemClass inv1 = new InvoiceItemClass("A101", "Pen Red", 888, 0.08);
		 System.out.println(inv1); //toString
	//getter and setter
	inv1.setQty(999);
	inv1.setUnitPrice(0.99);
	System.out.println(inv1);
	System.out.println("id là: " + inv1.getId());
	System.out.println("desc là: " + inv1.getDesc());
	System.out.println("qty là: " + inv1.getQty());
	System.out.println("unitPrice là: " + inv1.getUnitPrice());
	//test getTotal
	System.out.println("The Total là: " + inv1.getTotal());
	}

}
