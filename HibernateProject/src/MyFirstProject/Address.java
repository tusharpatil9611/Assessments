package MyFirstProject;

import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	 private String houseno,streetno, locality, city, villegage, distric, state, pin;

	public Address()
	{
		super();
	}

	public Address(String houseno, String streetno, String locality, String city, String villegage, String distric,
			String state, String pin)
	{
		super();
		this.houseno = houseno;
		this.streetno = streetno;
		this.locality = locality;
		this.city = city;
		this.villegage = villegage;
		this.distric = distric;
		this.state = state;
		this.pin = pin;
	}

	@Override
	public String toString()
	{
		return "Address [houseno=" + houseno + ", streetno=" + streetno + ", locality=" + locality + ", city=" + city
				+ ", villegage=" + villegage + ", distric=" + distric + ", state=" + state + ", pin=" + pin + "]";
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(city, distric, houseno, locality, pin, state, streetno, villegage);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(distric, other.distric)
				&& Objects.equals(houseno, other.houseno) && Objects.equals(locality, other.locality)
				&& Objects.equals(pin, other.pin) && Objects.equals(state, other.state)
				&& Objects.equals(streetno, other.streetno) && Objects.equals(villegage, other.villegage);
	}

	public String getHouseno()
	{
		return houseno;
	}

	public void setHouseno(String houseno) 
	{
		this.houseno = houseno;
	}

	public String getStreetno() {
		return streetno;
	}

	public void setStreetno(String streetno) {
		this.streetno = streetno;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getVillegage() {
		return villegage;
	}

	public void setVillegage(String villegage) {
		this.villegage = villegage;
	}

	public String getDistric() {
		return distric;
	}

	public void setDistric(String distric) {
		this.distric = distric;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
}
