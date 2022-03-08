package a13_인터페이스;

public class MonitorControl implements PowerButton, VolumeUpButton, VolumeDownButton {
	
	private boolean powerFlag;

	@Override
	public void keepTheDownButton() {
		// TODO Auto-generated method stub
		System.out.println("모니터 스피커의 사운드를 줄입니다.");
		
	}

	@Override
	public void keepTheUpButton() {
		// TODO Auto-generated method stub
		System.out.println("모니터 스피커의 사운드를 올립니다.");
		
	}

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		if(powerFlag == false) {
			System.out.println("모니터의 전원을 켭니다.");
			powerFlag = true;
		}else {
			System.out.println("모니터의 전원을 끕니다.");
			powerFlag = false;
		}
		
		
	}

	@Override
	public void sendSignal() {
		// TODO Auto-generated method stub
		System.out.println("모니터의 전원 신호" + powerFlag + "를 전송합니다.");
		
	}

	
	
}
