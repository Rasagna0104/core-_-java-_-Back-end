package Com.Enum;

public class Days {

	public static void main(String[] args)throws Exception {
		
		 //Object to call
	//  enum cls  refvar=enum cls.var ref;
		Days1 day=Days1.MON;
		
		
		//to get parent class 
		day.display();
		System.out.println(Days1.class.getSuperclass());
		System.out.println("-------------------------");
		
		// Iterate the class 
		Days1[] arr=Days1.values();
		for(Days1 d:arr)
		{
			
//			System.out.println("To Iterate Every element");
//			System.out.println("Days Of a week:"+d);
//			System.out.println();
			System.out.println("Indexs:"+d.ordinal());
		
		}
		System.out.println("------------- ------------------");
		switch(day)
		{
		case MON,TUES,WEDNES,THURS,FRI->System.out.println("Ohh it is week day");
		case SATUR,SUN->System.out.println("Ohh is a week end");
		default->throw new Exception("Invalid Input");
		}
		System.out.println(day);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		final String MON="Monday";
//		final String TUES="Tuesday";
//		final String WEDNES="Wednesday";
//		final String THURS="Thursday";
//		final String FRI="Friday";
//		final String SATUR="Saturday";
//		final String SUN="Sunday";
//		String[] arr={MON,TUES,WEDNES,THURS,FRI,SATUR,SUN};
//		String day=arr[4];
//		 if (day.equals(MON)||day.equals(TUES)
//	                ||day.equals(WEDNES)|| 
//				day.equals(THURS)||day.equals(FRI))
//				
//		{
//		System.out.println("Ohh Its is a week day");
//		}
//		else if(day.equals(SATUR)||day.equals(SUN))
//		{
//			System.out.println("Ohh Its is week End");
//		
//		}
//		else
//		{
//			System.out.println("Invalid week ");
//		}
//		System.out.println(day);
		
//		String SAR;  //it is used to throw a invalid exception
		
	
		
		
	}

	private static String ordinal() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
