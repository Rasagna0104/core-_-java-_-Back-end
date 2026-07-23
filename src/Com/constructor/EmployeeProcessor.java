package Com.constructor;

public class EmployeeProcessor {

	public static void main(String[] args) {
  Employee e=new Employee(201,"Bob","Developer",50000,5);
 System.out.println("before promotion:");
  System.out.println("Employee empId:"+e.getEmpId());
	System.out.println("name:"+e.getName());	  
	System.out.println("Designation :"+e.getDesignation());	
   System.out.println("salary:"+e.getSalary());
   System.out.println("performanceRating:"+e.getPerformanceRating());
	

	e.promoteEmployee();
	
	System.out.println("\nAfter promotion:");
	System.out.println("Designation:"+e.getDesignation());
	System.out.println("salary:"+e.getSalary());
}
}