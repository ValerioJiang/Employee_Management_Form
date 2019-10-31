package Controller;

import java.sql.SQLException;

import Model.EmployeeDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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

	@FXML private void insertEmployee(ActionEvent event) throws ClassNotFoundException, SQLException{
		String succConn = "Success! Your data has been registered correctly to the DB";
		try{
			EmployeeDAO.insertEmployee(txtFirstName.getText(), txtLastName.getText(), txtEmail.getText());
			resultConsole.setText(""+succConn);
		}catch(SQLException e) {
			System.out.println("Exception occur in insertion "+e);
			e.printStackTrace();
			throw e;
		}
	}
	@FXML private void updateEmployee(ActionEvent event) throws ClassNotFoundException,SQLException{
		try {
			EmployeeDAO.updateEmployee(Integer.parseInt(searchEmpId.getText()), searchEmpMail.getText());
		}catch(SQLException e) {
			System.out.println("Error has been occured while updating the data"+e);
			e.printStackTrace();
			throw e;
		}
	}

}
