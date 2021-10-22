package isp;

public class Person implements IEmail, ITelephone{
	String name, address, email, telephone;

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setAddress(String a) {
		address = a;
	}

	public String getAddress() {
		return address;
	}

	public void setTelephone(String t) {
		telephone = t;
	}

	public String getTelephone() {
		return telephone;
	}

	@Override
	public void setEmailAddress(String email) {
		this.email = email;
		
	}

	@Override
	public String getEmailAddress() {
		// TODO Auto-generated method stub
		return this.email;
	}

}
