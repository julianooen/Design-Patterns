package entities;

public class Address {
	private String street;
	private String number_compl;
	private String city;
	private String state;
	private String country;
	public Address(String street, String number_compl, String city, String state, String country) {
		super();
		this.street = street;
		this.number_compl = number_compl;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNumber_compl() {
		return number_compl;
	}
	public void setNumber_compl(String number_compl) {
		this.number_compl = number_compl;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", number_compl=" + number_compl + ", city=" + city + ", state=" + state
				+ ", country=" + country + "]";
	}
	
	
	
}
