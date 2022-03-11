package a13_인터페이스2;

import java.util.Scanner;

import a13_인터페이스2.controller.PageController;
import a13_인터페이스2.data.UserData;
import a13_인터페이스2.model.User;
import a13_인터페이스2.service.AccountServiceImpl;
import a13_인터페이스2.service.UserServiceImpl;
import a13_인터페이스2.view.IndexImpl;
import a13_인터페이스2.view.InputImpl;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //입력을 위해서 스캐너 객체 생성
		//UserData userData =new UserData(); //회원정보(User객체)를 저장하고 공유하기 위해 생성 ,UserData->User배열을 가지고있음			
		PageController pageController = new PageController(new InputImpl(),new UserServiceImpl(), new AccountServiceImpl());//서비스와 데이터를 소통하기위해 
		//PageContrller 객체안의 index()메소드를 실행하기 위해 생성	 (생성자를 통해서 객체들을 주입)	
		pageController.index(); //호출
		
		
		
	}

}
