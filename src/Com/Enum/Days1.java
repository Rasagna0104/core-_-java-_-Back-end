package Com.Enum;

public enum Days1 {
	
  MON(1,"1st day of week"),
  TUES(2,"2nd day of week"),
  WEDNES(3,"3rd day of week"),
  THURS(4,"4th day of week"),
  FRI(5,"5th day of week"),
  SATUR(6,"6th day of week"),
  SUN(7);
	int index;
	String status="close";
	private Days1()
	
	{
		System.out.println("Constructor called.........");
	}
//	
	private Days1(int index)
	
	{
		this.index=index;
		System.out.println("Its is a index value");
		
	}
	private Days1(int index,String status)
	{
		this.index=index;
		this.status=status;
		System.out.println("Its is a Index, & Status");
		}
	private Days1(String status)
	{
		this.status=status;
		System.out.println("It is a Status");
	}

	 public void display() {
		
		
	}
	
	
}
