

class FlightCustomer{
	
	String name;
	String phoneNumber;
	double earnedMileage;
	
	public FlightCustomer(String name, String phoneNumber, double earnedMileage) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.earnedMileage = earnedMileage;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEarnedMilaege(double earnedMileage) {
		this.earnedMileage = earnedMileage;
	}
	
	public void updateMileage(double price) {
		earnedMileage = earnedMileage + ((price*100)/(1.3));
	}
	public double getMileage() {
		return this.earnedMileage;
	}
}
