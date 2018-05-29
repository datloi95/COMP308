class FullName {
	String title;
	String firstName;
	String middleName;
	String lastName;	

	FullName(String title, String firstName, String middleName, String lastName) {
		this.title = title;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName= lastName;
	}
	public String toString() {
		return title + " " + firstName + " " + middleName + " " + lastName;
	}
	public static void main(String args[]) {
		FullName name = new FullName("Mr.","Andrew", "Charles", "King");
		System.out.println(name);
	}
}

class MailingAddress {
	String streetAddress;
	String city;
	String province;
	String postalCode;
	MailingAddress(String streetAddress, String city, String province, String postalCode,
					String title, String firstName, String middleName, String lastName) {
		this.streetAddress = streetAddress;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
		FullName name = new FullName(title, firstName, middleName, lastName);
	}
	public String toString() {
		return name + ", " + streetAddress + ", " + city + ", "+ city + " " + postalCode;
	}
}

class ShippingLabel() {
	ShippingLabel(String streetAddress, String city, String province, String postalCode,
					String title, String firstName, String middleName, String lastName) {
		MailingAddress shipFrom = new MailingAddress(streetAddress, city, province, postalCode, title, firstName, middleName, lastName) 
	}
	public static void main(String args[]) {
		ShippingLabel labelFrom = new ShippingLabel("230 LakeShore", "Mississauga", "ON", " 3N1 4P2", "Mr.","Andrew", "Charles", "King")
	}
}