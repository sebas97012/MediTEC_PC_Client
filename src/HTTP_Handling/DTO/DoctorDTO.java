package HTTP_Handling.DTO;


import datastructures.avltree.AVLTree;
import datastructures.binarytree.BinaryTree;
import datastructures.linkedlist.LinkedList;
import datastructures.splaytree.SplayTree;

public class DoctorDTO implements Comparable<DoctorDTO> {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String password;
	private String name;
	private int id;
	private AVLTree<Appointment> appointmentsList;
	private SplayTree<PatientDTO> patientsList;
	private LinkedList<Commentary> commentaries;
	private BinaryTree<ClinicalCase> clinicalCaseList;

	public DoctorDTO(){

	}

	public DoctorDTO(int id){
		this.id = id;
		this.appointmentsList = new AVLTree<Appointment>();
		this.patientsList = new SplayTree<PatientDTO>();
		this.commentaries = new LinkedList<Commentary>();
		this.clinicalCaseList = new BinaryTree<ClinicalCase>();
	}

	public int getId() {
		return id;
	}

	public AVLTree<Appointment> getAppointmentsList() {
		return appointmentsList;
	}

	public SplayTree<PatientDTO> getPatientsList() {
		return patientsList;
	}

	public LinkedList<Commentary> getCommentaries() {
		return commentaries;
	}

	public BinaryTree<ClinicalCase> getClinicalCaseList(){
		return this.clinicalCaseList;
	}

	public int compareTo(DoctorDTO arg0) {
		if(this.id > arg0.getId()){
			return 1;
		} else if(this.id < arg0.getId()){
			return -1;
		} else{
			return 0;
		}
	}
}