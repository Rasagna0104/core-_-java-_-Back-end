package Com.elctronics.devices;

public class Laptop {
 String Model;
 double price;
 public void setModel(String Mdl)
 {
	Model=Mdl; 
 }
 public String getModel()
 {
	 return Model;
 }
 public void setPrice(double Psc)
 {
	 price=Psc;
 }
	public double getPrice()
	{
		return price;
	}
	public  void  showLaptopDetails()
	{
		System.out.println("Model:"+Model);
		System.out.println("price:"+price);
	}
	
	public static void main(String[] args) {
     
	}

}
  



//Create a Laptop class in com.electronics.devices with: 
//Private fields: model (String), price (double) 
//Public setter and getter methods 
//A public method showLaptopDetails() 
