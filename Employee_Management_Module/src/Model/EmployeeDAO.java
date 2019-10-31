package Model;

import java.sql.ResultSet;
import java.sql.SQLException;

import Util.DBUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class EmployeeDAO {
	public static void insertEmployee(String firstName, String lastName, String email)throws SQLException, ClassNotFoundException {
		String sql = "insert into employee(first_name,last_name,email) values ('"+firstName+"','"+lastName+"','"+email+"')";
		try {
			DBUtil.dbExcecuteQuery(sql);
		}
		catch(SQLException e) {
			System.out.println("Exception occur while inserting the data "+e);
			e.printStackTrace();
			throw e;
		}
	}
	public static void updateEmployee(int id, String email) throws SQLException, ClassNotFoundException{
		String sql ="update employee set email = '"+email+"' where id = '"+id+"' ";
		try {
			DBUtil.dbExcecuteQuery(sql);

		}catch(SQLException e){
			System.out.println("Error occured while updating the record "+e);
			e.printStackTrace();
			throw e;
		}
	}
	public static void deleteEmployeeById(int id) throws SQLException, ClassNotFoundException{
		String sql ="delete from employee where id = '"+id+"'";
		try {
			DBUtil.dbExcecuteQuery(sql);

		}catch(SQLException e){
			System.out.println("Error occured while deleting the record "+e);
			e.printStackTrace();
			throw e;
		}
	}
	public static ObservableList<Employee> getAllRecords() throws SQLException, ClassNotFoundException{
		String sql ="select * from employee";
		try {
			ResultSet rsSet =  DBUtil.dbExecute(sql);
			ObservableList<Employee> empList =  getEmployeeObject(rsSet);
			return empList;
			
		}catch(SQLException e){
			System.out.println("Error occured while deleting the record "+e);
			e.printStackTrace();
			throw e;
		}
	}
	private static ObservableList<Employee> getEmployeeObject(ResultSet rsSet) throws SQLException,ClassNotFoundException {
		try {
			ObservableList<Employee> empList = FXCollections.observableArrayList();
			while(rsSet.next()) {
				Employee emp = new Employee();
				emp.setEmpId(rsSet.getInt("id"));
				emp.setEmpName(rsSet.getString("first_name"));
				emp.setEmpLastName(rsSet.getString("last_name"));
				emp.setEmpEmail(rsSet.getString("email"));
				empList.add(emp);
			}
			return empList;
		}catch(SQLException e) {
			System.out.println("Error occured while fetching the data from DB "+e);
			e.printStackTrace();
			throw e;
		}

	}
}
