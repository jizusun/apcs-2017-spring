package telephone;

public class Telphone {
	private String brand;
	private int weight;

	public Telphone() {
		brand = "";
		weight = 0;
	}
	
	public Telphone(String brandName, int weight){
		brand = brandName;
		this.weight = weight;
	}
	
	//accessor
	public String getBrand(){
		return brand;
	}
	
	public int weight(){
		return weight;
	}
	
	//mutator 
	public void setBrand(String brand){
		this.brand=brand;
	}
	
	public void setWeight(int weight){
		this.weight=weight;
	}
	
	public void call(){
		System.out.println("Telphone call");
	}
	
	public void message(){
		System.out.println("Telphone can message");
		
	}
	
	

}
