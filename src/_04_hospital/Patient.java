package _04_hospital;

public class Patient {
public int cf = 0;
	public Object feelsCaredFor() {
		// TODO Auto-generated method stub
		if (cf == 0) {
			return false;	
		}
		return true;
	}

	public void checkPulse() {
		cf++;
	}

}
