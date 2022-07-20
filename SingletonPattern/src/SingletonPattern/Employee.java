package SingletonPattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Employee {

    public static volatile Connection connection;
    private static volatile Employee employeeId;


    public Connection getConnection() {
        if(connection==null){
            synchronized (Employee.class) {
                if(connection==null) {
                    String url = "jdbc:mysql://localhost:3306";
                    String root = "root";
                    String password = "";
                    try {
                        connection = DriverManager.getConnection(url, root, password);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return connection;
    }

    private Employee(){
        if(employeeId != null){
            throw new RuntimeException("please use get EmployeeID method");
        }
    }

    public static Employee getEmployeeID(){
        if (employeeId == null){
            synchronized (Employee.class){
                if(employeeId==null){
                    employeeId = new Employee();
                }
            }
        }
        return employeeId;
    }
}
