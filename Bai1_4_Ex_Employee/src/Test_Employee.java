
public class Test_Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     EmployeeClass e1 = new EmployeeClass(8, "null", "Peter", 2500);
         System.out.println(e1);  //toString
         //Getter and Setter
         e1.setSalary(999);
         System.out.println(e1);
         System.out.println("id là: " + e1.getId());
         System.out.println("FirstName là: " + e1.getFirstName());
         System.out.println("LastName là: "+ e1.getLastName());
         System.out.println("Salary là: " + e1.getSalary());
         System.out.println("Name là: " + e1.getName());
         System.out.println("AnnualSalary là: " + e1.getAnnualSalary());
         //test kiểm tra lương 
         System.out.println(e1.raiseSalary(10));
         System.out.println(e1);
	}
	}


