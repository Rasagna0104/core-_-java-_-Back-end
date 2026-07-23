package Com.constructor;



public class Employee {
	private int empId;
	private String name;
	private String Designation;
	private double salary;
	public int performanceRating;
 public Employee(int empId,String name,String Designation,double salary,int performanceRating)
 {
	this.empId=empId;
	this.name=name;
	this.Designation=Designation;
	this.salary=salary;
	this.performanceRating=performanceRating;
 }
 
	
	public void setDesignation(String Designation)
	{
		this.Designation=Designation;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public int getEmpId()
	{
		return empId;
	}
	public String getName()
	{
		return name;
		
	}
	public String getDesignation ()
	{
		return Designation;
	}
	public double getSalary()
	{
		return salary;
	}
	public int getPerformanceRating()
	{
		return performanceRating;
	}
	public void promoteEmployee()
	{
	if(performanceRating>=4)
	{
		Designation= "Senior " +Designation;
	salary=salary+(salary*0.20);
			
		System.out.println("promote to next level");
	
	}
	else
	{
		System.out.println("no promotion");
	}
	}
	
		
	
		
	
	}


