package Model;

import java.sql.SQLException;

import Util.DBUtil;

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
}
