
class Flight{
	
	int flightNumber;
	double price;		
	String airline;		
	String depCity;
	String desCity;
	
	public Flight(int flight_Number, double fare, String company, String dep_City, String des_City) {
		
		flightNumber = flight_Number;
		price = fare;
		airline = company;
		depCity = dep_City;
		desCity = des_City;
		
	}
	
	//Creates a default constructor
	public Flight() {
		
		flightNumber = 0;
		price = 0;
		airline = "Unknown";
		desCity = "Unknown";
		depCity = "Unknown";
	}
	
	//Set values 
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setAirline(String airline) {
		this.airline = airline;
	}
	
	public void setDepCity(String depCity) {
		this.depCity = depCity;
	}
	
	public void setDesCity(String desCity) {
		this.desCity = desCity;
	}
	
	//Get Values
	public double getFlightNumber() {
		return this.flightNumber;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String getDepCity() {
		return this.depCity;
	}
	
	public void pricingMethod(int numberOfDays) {
		
		price = price + numberOfDays *20;
		
		System.out.println("Price model: "+ price);
	}
	
}



