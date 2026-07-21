package Com.elctronics.app.packags;
import Com.elctronics.devices.Laptop;
import Com.elctronics.brands.Manufacturer;
public class ElectronicApp {

	
	
	
	public static void main(String[] args) {
  Laptop l=new Laptop();
  l.setModel("Dell XPS 15");
  l.setPrice(1500.99);
  
  Manufacturer m=new  Manufacturer();
  m.setbranchname("Dell");
  m.setcountry("USA");
 System.out.println("Model:"+l.getModel());
 System.out.println("price:"+l.getPrice());
 System.out.println("branchname:"+m.getBranchName());
 System.out.println("country:"+m.getCountry());
  
	}

}











//In ElectronicsApp ( com.electronics.app package): 
//Create objects of Laptop and Manufacturer 
//Assign values using setters 
//Call methods to print details 
