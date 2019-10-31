package Model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Employee {
	private IntegerProperty idProperty;
	private StringProperty nameProperty;
	private StringProperty lastnameProperty;
	private StringProperty emailProperty;
	public Employee() {
		this.idProperty = new SimpleIntegerProperty();
		this.nameProperty = new SimpleStringProperty();
		this.lastnameProperty = new SimpleStringProperty();
		this.emailProperty = new SimpleStringProperty();
	}
	
	//this is for employee id
	public int getEmpId() {
		return idProperty.get();
	}
	public void setEmpId(int id) {
		this.idProperty.set(id);
	}
	public IntegerProperty getEmployeeId() {
		return idProperty;
	}
	
	public String getEmpName() {
		return nameProperty.get();
	}
	public void setEmpName(String name) {
		this.nameProperty.set(name);
	}
	public StringProperty getEmployeeName() {
		return nameProperty;
	}
	
	public String getEmpLastName() {
		return lastnameProperty.get();
	}
	public void setEmpLastName(String lastname) {
		this.lastnameProperty.set(lastname);
	}
	public StringProperty getEmployeeLastName() {
		return lastnameProperty;
	}
	
	public String getEmpEmail() {
		return emailProperty.get();
	}
	public void setEmpEmail(String email) {
		this.emailProperty.set(email);
	}
	public StringProperty getEmployeeEmail() {
		return emailProperty;
	}
	
}
