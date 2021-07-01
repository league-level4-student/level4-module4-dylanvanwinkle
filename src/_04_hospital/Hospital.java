package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	  ArrayList<Doctor> Doctors = new ArrayList<>();
	  ArrayList<Patient> patients = new ArrayList<>();
	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return Doctors;
	}

	public void addDoctor(GeneralPractitioner generalPractitioner) {
		// TODO Auto-generated method stub
		Doctors.add(generalPractitioner);
		}

	public void addDoctor(Surgeon surgeon) {
		// TODO Auto-generated method stub
		Doctors.add(surgeon);
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

}
