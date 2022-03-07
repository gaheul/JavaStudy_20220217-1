package a11_상속.User;

public class CompanyUser extends User {
	private String companyName;
	private String Address;
	private String companytel;
	public CompanyUser() {
		
	}
	public CompanyUser(String companyName, String address, String companytel) {
		super();
		this.companyName = companyName;
		Address = address;
		this.companytel = companytel;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCompanytel() {
		return companytel;
	}
	public void setCompanytel(String companytel) {
		this.companytel = companytel;
	}
	
	

}
