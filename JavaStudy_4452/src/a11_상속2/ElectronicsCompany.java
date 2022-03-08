package a11_상속2;

public class ElectronicsCompany extends Company {
	
	public ElectronicsCompany() {
		//super(); 생략 
	}
	
	public ElectronicsCompany(String companyName) {
	         super(companyName + "전자");
			//super.setCompanyName(companyName);
		}
	
	@Override
	public void setCompanyName(String companyName) {
		
		super.setCompanyName(companyName +"전자");
	}
	
	public void addFactory() {
		System.out.println(super.getCompanyName()+"공장을 추가합니다.");
	}

}
