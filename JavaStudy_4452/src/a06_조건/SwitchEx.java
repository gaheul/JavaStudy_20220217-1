package a06_조건;

public class SwitchEx {

	public static void main(String[] args) {
		int select = 4;
		
		switch(select) {
			case 1 :
				System.out.println("1을 선택하셨습니다.");
				break;
			case 2 : 
				System.out.println("2를 선택하셨습니다.");
				break;
			case 3 : 
				System.out.println("3을 선택하셨습니다.");
				break;
			default :
				System.out.println("해당 case는 없습니다.");
		}
		
		
		String select2 = "김가흘";
		
		switch(select2) {
			case "김가흘" :
				System.out.println("선택하신 이름은 김가흘입니다.");
				break;
			case "김가흘2" :
				System.out.println("선택하신 이름은 김가흘2입니다.");
				break;
			case "김가흘3" :
				System.out.println("선택하신 이름은 김가흘3입니다.");
				break;
		}
		
		int num = 21;		 
		switch(num ==0 ? 2 : num%2 ) {
			case 1 :                                      //(num%2의 결과 ->case)
				System.out.println("홀수입니다.");
				break;
			case 0 :
				System.out.println("짝수입니다.");
				break;
			default: 
				System.out.println("num이 0입니다.");
		}
		}
	}


