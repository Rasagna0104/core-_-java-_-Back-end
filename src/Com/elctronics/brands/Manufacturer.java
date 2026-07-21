package Com.elctronics.brands;

public class Manufacturer {
	String branchname;
	String country;
	public void setbranchname(String  branchname )
	{
		this.branchname=branchname;
	}
public String getBranchName()
{
	return branchname;
}
public void setcountry(String country)
{
	this.country=country;
	
}
public String getCountry()
{
	return country;
}
	public void showManufacturerDetails()
	{
		System.out.println("branchname:"+branchname);
		System.out.println("country:"+country);
	}
	
	
	public static void main(String[] args) {

	}

}









//Create a Manufacturer class in com.electronics.brands with: 
//Private fields: brandName (String), country (String) Public setter and getter methods 
//A public method showManufacturerDetails() 
