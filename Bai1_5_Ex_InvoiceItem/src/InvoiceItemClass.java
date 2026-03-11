
public class InvoiceItemClass {
	private String id ;
	private String desc ;
	private int qty ;
	private double unitPrice;
	public InvoiceItemClass(String id , String desc , int qty , double unitPrice ) {
		 this.id = id;
    	 this.desc = desc;
    	 this.qty = qty;
    	 this.unitPrice = unitPrice;
	}
	public String getId () {
		return id ;
	}
	public String getDesc() {
		return desc ;
	}
	public int getQty () {
		return qty ;
	}
	public double getUnitPrice() {
		return unitPrice ;
	}
	void setUnitPrice (double unitPrice) {
		this.unitPrice = unitPrice ;
	}
	void setQty(int qty) {
		this.qty = qty ;
	}
	public double getTotal() {
		return unitPrice*qty ;
	}
	public String toString () {
		return "InvoiceItem[id = " + id +",desc = "+desc+" ,qty ="+qty+", unitPrice ="+unitPrice+ "]";
		 
	}
}
