package sorting;

public class Car implements Comparable<Car>{
	
	private String registrationNumber;
	private int price;
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	//Define Constructor
	public Car(String registrationNumber){
		this.registrationNumber = registrationNumber;
	}
	
	public boolean equal(Object obj){
		if(obj != null && obj instanceof Car){
			String regNumber = ((Car)obj).getRegistrationNumber();
			if(regNumber != null && regNumber.equals(this.registrationNumber)){
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode(){
		return this.registrationNumber.hashCode();
	}
	
	@Override
	public String toString(){
		return this.registrationNumber;
	}
	
	@Override
	public int compareTo(Car o) {
		//For Ascending Orders
		if(this.getPrice() > o.getPrice()){
			return 1;
		} else if(this.getPrice() < o.getPrice()){
			return -1;
		}
		return 0;
		
		//For Descending Order
//		if(this.getPrice() < o.getPrice()){
//			return -1;
//		} else if (this.getPrice() > o.getPrice()){
//			return 1;
//		}
//		return 0;
	}
}
