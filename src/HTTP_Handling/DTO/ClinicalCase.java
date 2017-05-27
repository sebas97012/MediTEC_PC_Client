package HTTP_Handling.DTO;


import datastructures.avltree.AVLTree;
import datastructures.binarytree.BinaryTree;
import datastructures.linkedlist.LinkedList;

public class ClinicalCase implements Comparable<ClinicalCase>{
	private String name;
	private int patient;
	private AVLTree<MedicalExam> medicalExams;
	private LinkedList<String> symptoms;
	private BinaryTree<Drug> drugs;
	private int id;

	public ClinicalCase(){

	}

	public ClinicalCase(int patientID, int id, LinkedList<String> symptoms){
		this.patient = patientID;
		this.id = id;
		this.medicalExams = new AVLTree<MedicalExam>();
		this.symptoms = symptoms;
		this.drugs = new BinaryTree<Drug>();
	}

	public ClinicalCase(String name, int patientID, int id){
		this.name = name;
		this.patient = patientID;
		this.id = id;
		this.medicalExams = new AVLTree<MedicalExam>();
		this.symptoms = new LinkedList<String>();
		this.drugs = new BinaryTree<Drug>();
	}

	public String getName() {
		return name;
	}

	public int getPatient() {
		return patient;
	}

	public AVLTree<MedicalExam> getMedicalExams() {
		return medicalExams;
	}

	public LinkedList<String> getSymptoms() {
		return symptoms;
	}

	public BinaryTree<Drug> getDrugs() {
		return drugs;
	}

	public int getId() {
		return id;
	}

	public int compareTo(ClinicalCase clinicalCase) {
		if(this.id > clinicalCase.getId()){
			return 1;
		} else if(this.id < clinicalCase.getId()){
			return -1;
		} else{
			return 0;
		}
	}


}