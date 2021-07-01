package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	  ArrayList<Patient> dp = new ArrayList<>();
	public Object performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		// TODO Auto-generated method stub
		if (dp.size() == 3) {
			throw new DoctorFullException();	
		}
		dp.add(patient);


	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return dp;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		for (Patient p: dp) {
		p.checkPulse();
		}
	}

}
