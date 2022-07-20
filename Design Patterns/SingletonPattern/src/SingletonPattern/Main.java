package SingletonPattern;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
	// write your code here

        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        Employee employeeId = Employee.getEmployeeID();
        System.out.println("Employee Instance 01: "+ employeeId);


        Connection connection = employeeId.getConnection();
        endTime = System.currentTimeMillis();

        System.out.println("Time taken to create first instance: "+ (endTime-startTime));


        startTime = System.currentTimeMillis();
        Employee employeeId1 = Employee.getEmployeeID();
        System.out.println("Employee Instance 01: "+ employeeId);


        Connection connection2 = employeeId.getConnection();
        endTime = System.currentTimeMillis();

        System.out.println("Time taken to create first instance: "+ (endTime-startTime));

    }
}
