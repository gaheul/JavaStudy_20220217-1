package a11_상속2;

public class DeliveryCompany extends Company {
	
	public DeliveryCompany() {
		
	}
	
	public DeliveryCompany(String companyName) {
			super(companyName +" 배달 대행업체");
		}
	
	@Override
	public void setCompanyName(String companyName) {
		
		super.setCompanyName(companyName+"배달 대행업체");
	}
	
	public void addMotorcycle() { 
		System.out.println(super.getCompanyName()+"배달용 오토바이르 추가합니다.");
	}
}
