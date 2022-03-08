package a11_상속2;

public class CompanyTest {

	public static void main(String[] args) {
		ElectronicsCompany samsung = new ElectronicsCompany("삼성");
		ElectronicsCompany lg = new ElectronicsCompany("LG");
		DeliveryCompany baemin = new DeliveryCompany("배달의민족");
		DeliveryCompany yogiyo = new DeliveryCompany("요기요");
		
		samsung.setCompanyName("삼송");
		
		Company samsung_company = samsung;
		Company lg_company = lg;
		Company baemin_company = baemin;
		Company yogiyo_company = yogiyo;
		
		samsung_company.setCompanyName("삼성");
		
//		samsung.setCompanyName("삼성전자");
//		lg.setCompanyName("LG");
//		baemin.setCompanyName("배달의민족");
//		yogiyo.setCompanyName("요기요");

		samsung.showCompanyInfo();
		lg.showCompanyInfo();
		baemin.showCompanyInfo();
		yogiyo.showCompanyInfo();
		
		samsung.addFactory();
		lg.addFactory();
		baemin.addMotorcycle();
		yogiyo.addMotorcycle();
		
		samsung_company.showCompanyInfo();
		ElectronicsCompany down_samsungCompany =(ElectronicsCompany) samsung_company;
		down_samsungCompany.addFactory();
		
		Company c =new Company();
//		ElectronicsCompany ec = (ElectronicsCompany)c;
//		ec.addFactory();  -> 문법상 오류는 없지만 실행시 안됨(자식이 애초에 없기때문)
		c.setCompanyName("삼성");
		c.showCompanyInfo();
		
	}

}
