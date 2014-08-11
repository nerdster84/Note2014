package Imodel;

import java.util.Date;
import java.util.List;

/**This interface defines the basic type for all possible input for a note
 * 
 * @author dide
 *
 */
public interface INote {
	
	int getNrOfNote();
	void setNrOfNote(int nr);
	String getNameOfNote();
	void setNameOfNote(String name);
	Date getDateOfCreation();
	void setDateOfCreation(Date d);
	Date getDateOfLastChange();
	void setDateOfLastChange(Date d);
	Date getDateOfBeingIrrelevant();
	void setDateOfBeingIrrelevant(Date d);
	int getParentNote();
	void setParentNote(int nr);
	// List<Integer> getChildrenOfNote();
	// void setChildrenOfNote(List<Integer> children);
}
