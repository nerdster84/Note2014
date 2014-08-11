package model;

import Imodel.INote;

import java.util.Date;
import java.util.List;

public abstract class AbstractNote implements INote {
	
	private int nrOfNote;
	private String nameOfNote; 
	private Date dateOfCreation, dateOfLastChange, dateOfBeingIrrelevant;
	private int parentNote;
	private List<Integer> children;

	public int getNrOfNote() {
		return nrOfNote;
	}
	public void setNrOfNote(int nrOfNote) {
		this.nrOfNote = nrOfNote;
	}
	public String getNameOfNote() {
		return nameOfNote;
	}
	public void setNameOfNote(String nameOfNote) {
		this.nameOfNote = nameOfNote;
	}
	public Date getDateOfCreation() {
		return dateOfCreation;
	}
	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}
	public Date getDateOfLastChange() {
		return dateOfLastChange;
	}
	public void setDateOfLastChange(Date dateOfLastChange) {
		this.dateOfLastChange = dateOfLastChange;
	}
	public Date getDateOfBeingIrrelevant() {
		return dateOfBeingIrrelevant;
	}
	public void setDateOfBeingIrrelevant(Date dateOfBeingIrrelevant) {
		this.dateOfBeingIrrelevant = dateOfBeingIrrelevant;
	}
	public int getParentNote() {
		return parentNote;
	}
	public void setParentNote(int parentNote) {
		this.parentNote = parentNote;
	}
	public List<Integer> getChildren() {
		return children;
	}
	public void setChildren(List<Integer> children) {
		this.children = children;
	}
	
	
	
}
