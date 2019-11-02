package Controller;
//a
import java.sql.SQLException;

import Model.Employee;
import Model.EmployeeDAO;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EmployeeController {

	@FXML
	private TextField txtFirstName;

	@FXML
	private TextField txtLastName;

	@FXML
	private TextField txtEmail;

	@FXML
	private TextArea resultConsole;

	@FXML
	private TextField searchEmpId;

	@FXML
	private TextField searchEmpMail;

	@FXML
	private TableColumn<Employee,Integer> colEmpId;

	@FXML
	private TableColumn<Employee,String> colEmpName;

	@FXML
	private TableColumn<Employee,String> colEmpLastName;

	@FXML
	private TableColumn<Employee,String> colEmpEmail;

	@FXML
	private TableView<Employee> employeeTable;

	@FXML
	private void insertEmployee(ActionEvent event) throws ClassNotFoundException, SQLException{
		String succConn = "Success! Your data has been registered correctly to the DB";
		try{
			EmployeeDAO.insertEmployee(txtFirstName.getText(), txtLastName.getText(), txtEmail.getText());
			resultConsole.setText(""+succConn);
			ObservableList<Employee> empList = EmployeeDAO.getAllRecords();
			populateTable(empList);
		}catch(SQLException e) {
			System.out.println("Exception occur in insertion "+e);
			e.printStackTrace();
			throw e;
		}
	}

	@FXML
	private void updateEmployee(ActionEvent event) throws ClassNotFoundException,SQLException{
		try {
			String succUpd = "Success! Your email has been updated correctly to the DB";
			int employeeID = Integer.parseInt(searchEmpId.getText());
			String updEmail = ""+searchEmpMail.getText();
			EmployeeDAO.updateEmployee(employeeID, updEmail);
			resultConsole.setText(""+succUpd);
			ObservableList<Employee> empList = EmployeeDAO.getAllRecords();
			populateTable(empList);
		}catch(SQLException e) {
			System.out.println("Error has been occured while updating the data"+e);
			e.printStackTrace();
			throw e;
		}
	}

	@FXML
	private void deleteEmployee(ActionEvent event) throws ClassNotFoundException,SQLException{
		try {
			String succDel = "Success! Your employee id has been deleteded correctly to the DB";
			int employeeID = Integer.parseInt(searchEmpId.getText());
			EmployeeDAO.deleteEmployeeById(employeeID);
			resultConsole.setText(""+succDel);
			ObservableList<Employee> empList = EmployeeDAO.getAllRecords();
			populateTable(empList);
		}catch(SQLException e) {
			System.out.println("Error has been occured while deleting the data"+e);
			e.printStackTrace();
			throw e;
		}
	}

	@FXML
	private void searchEmployee(ActionEvent event) throws ClassNotFoundException,SQLException{
		ObservableList<Employee> list = EmployeeDAO.searchEmployee(searchEmpId.getText());
		if(list.size() > 0) {
			populateTable(list);
			resultConsole.setText("Record has been found");
		}
		else {
			resultConsole.setText("Record hasn't found");
		}
	}

	@FXML
	private void searchAllEmployee(ActionEvent event)throws SQLException,ClassNotFoundException{
		ObservableList<Employee> list = EmployeeDAO.getAllRecords();
		populateTable(list);
	}

	@FXML
	private void initialize() throws Exception{
		colEmpId.setCellValueFactory(cellData -> cellData.getValue().getEmployeeId().asObject());
		colEmpName.setCellValueFactory(cellData -> cellData.getValue().getEmployeeName());
		colEmpLastName.setCellValueFactory(cellData -> cellData.getValue().getEmployeeLastName());
		colEmpEmail.setCellValueFactory(cellData -> cellData.getValue().getEmployeeEmail());
		ObservableList<Employee> empList = EmployeeDAO.getAllRecords();
		populateTable(empList);
	}

	@FXML
	private void clear()throws Exception{
		txtFirstName.setText("");
		txtLastName.setText("");
		txtEmail.setText("");
	}

	private void populateTable(ObservableList<Employee> empList) {
		employeeTable.setItems(empList);

	}
}
