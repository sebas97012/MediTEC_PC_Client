package HTTP_Handling.DTO;


import datastructures.avltree.AVLTree;
import datastructures.linkedlist.LinkedList;

public class PatientDTO implements Comparable<PatientDTO>{
	private String name;
	private int age;
	private int identificationNumber;
	private int phoneNumber;
	private AVLTree<Appointment> appointmentList;
	private LinkedList<Appointment> caseFile;
	
	public PatientDTO(){
		
	}
	
	public PatientDTO(int identificationNumber){
		this.identificationNumber = identificationNumber;
	}
	
	public PatientDTO(String name, int age, int identificationNumber, int phoneNumber){
		this.name = name;
		this.age = age;
		this.identificationNumber = identificationNumber;
		this.phoneNumber = phoneNumber;
		this.appointmentList = new AVLTree<Appointment>();
		this.caseFile = new LinkedList<Appointment>();
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getIdentificationNumber() {
		return identificationNumber;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public AVLTree<Appointment> getAppointmentList() {
		return appointmentList;
	}

	public LinkedList<Appointment> getCaseFile() {
		return caseFile;
	}
	
	public int compareTo(PatientDTO patient) {
		if(this.identificationNumber > patient.getIdentificationNumber()){
			return 1;
		} else if(this.identificationNumber < patient.getIdentificationNumber()){
			return -1;
		} else{
			return 0;
		}
	}
}
